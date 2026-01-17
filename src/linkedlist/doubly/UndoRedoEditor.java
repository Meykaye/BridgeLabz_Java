package linkedlist.doubly;
/*
 * Undo / Redo functionality using Doubly Linked List
 */
class TextState {
    String content;
    TextState next, prev;

    TextState(String content) {
        this.content = content;
    }
}

public class UndoRedoEditor {

    private TextState current;

    public void addState(String text) {
        TextState newState = new TextState(text);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
    }

    public void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    public void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    public void display() {
        if (current != null)
            System.out.println("Current Text: " + current.content);
    }

    public static void main(String[] args) {
        UndoRedoEditor editor = new UndoRedoEditor();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.undo();
        editor.display();
    }
}
