import java.util.*;

class EditorNode {
    String content;
    EditorNode previous;
    EditorNode forward;

    EditorNode(String content) {
        this.content = content;
        this.previous = null;
        this.forward = null;
    }
}

public class TextEditorManager {

    static EditorNode start = null;
    static EditorNode pointer = null;
    static int count = 0;
    static final int MAX_HISTORY = 10;

    public static void main(String[] args) {

        saveState("Hello");
        saveState("Hello World");
        saveState("Hello World!");
        showCurrent();

        stepBack();
        showCurrent();

        stepBack();
        showCurrent();

        stepForward();
        showCurrent();

        saveState("Hello World!!!");
        showCurrent();

        stepForward();
    }

    // Adds a new text snapshot
    static void saveState(String data) {
        EditorNode node = new EditorNode(data);

        // remove forward history if exists
        if (pointer != null && pointer.forward != null) {
            pointer.forward.previous = null;
            pointer.forward = null;
        }

        if (start == null) {
            start = node;
            pointer = node;
            count = 1;
        } else {
            pointer.forward = node;
            node.previous = pointer;
            pointer = node;
            count++;
        }

        // maintain history limit
        while (count > MAX_HISTORY) {
            start = start.forward;
            start.previous = null;
            count--;
        }
    }

    // Undo operation
    static void stepBack() {
        if (pointer != null && pointer.previous != null) {
            pointer = pointer.previous;
            System.out.println("Undo successful.");
        } else {
            System.out.println("Undo not possible.");
        }
    }

    // Redo operation
    static void stepForward() {
        if (pointer != null && pointer.forward != null) {
            pointer = pointer.forward;
            System.out.println("Redo successful.");
        } else {
            System.out.println("Redo not possible.");
        }
    }

    // Display current editor content
    static void showCurrent() {
        if (pointer != null) {
            System.out.println("Current Content: \"" + pointer.content + "\"");
        } else {
            System.out.println("No content available.");
        }
    }
}
