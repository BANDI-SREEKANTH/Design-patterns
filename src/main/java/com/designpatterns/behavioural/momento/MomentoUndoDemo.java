package com.designpatterns.behavioural.momento;

public class MomentoUndoDemo {
    public static void main(String[] args)
    {
        TextEditor textEditor=new TextEditor();
        EditorHistory editorHistory=new EditorHistory();
        textEditor.setText("sree");
        System.out.println("Current text in text editor : "+textEditor.getText());
        editorHistory.saveState(textEditor.save());
        textEditor.setText("Kanth");
        System.out.println("Current text in text editor : "+textEditor.getText());
        editorHistory.saveState(textEditor.save());

        Momento previousState1=editorHistory.undo();
        System.out.println("The previous state of text editor is : "+previousState1.getText());
        Momento previousState2=editorHistory.undo();
        System.out.println("The previous state of text editor is : "+previousState2.getText());

        Momento previousState3=editorHistory.undo();
        if(previousState3==null)
        {
            System.out.println("Empty Text Editor");
        }
        else
            System.out.println("The previous state of text editor is : "+previousState3.getText());





    }
}
