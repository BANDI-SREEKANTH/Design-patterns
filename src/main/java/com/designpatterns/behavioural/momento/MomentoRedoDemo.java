package com.designpatterns.behavioural.momento;

public class MomentoRedoDemo {
    public static void main(String[] args)
    {
        TextEditor textEditor=new TextEditor();
        EditorHistory editorHistory=new EditorHistory();
        //intial change
        textEditor.setText("Sree");
        editorHistory.saveState(textEditor.save());
        //first change

        textEditor.setText("SreeKanth");
        editorHistory.saveState(textEditor.save());

        // second change

        textEditor.setText("SreeKanth Bandi");
        System.out.println("The text is : "+textEditor.getText());

        Momento previousState=editorHistory.undo();
        if(previousState!=null)
        {
            textEditor.restore(previousState);
            System.out.println("After undo : "+previousState.getText());
        }

        Momento redoState=editorHistory.redo(textEditor.save());
        if(redoState!=null)
        {
            textEditor.restore(redoState);
            System.out.println("After redo : "+redoState.getText());
        }
    }
}
