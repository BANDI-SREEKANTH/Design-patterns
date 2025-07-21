package com.designpatterns.behavioural.momento;


// It acts as caretaker to hold the all history undo and redo features

import java.util.Stack;

public class EditorHistory {
    Stack<Momento> undoStack=new Stack<>();
    Stack<Momento> redoStack=new Stack<>();
    public void saveState(Momento momento)
    {
        undoStack.push(momento);
        redoStack.clear();
    }
    public Momento undo()
    {
        if(!undoStack.isEmpty())
        {
            return undoStack.pop();
        }
        return null;
    }
    // Redo operation: push current state to undo stack and return last state from
    // redo stack
    public Momento redo(Momento currentState) {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentState);
            return redoStack.pop();
        }
        return null;
    }
}
