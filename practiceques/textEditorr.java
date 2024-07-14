package practiceques;

import java.util.Stack;

public class textEditorr {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addText("Hello, ");
        editor.addText("World !!");

         // Get the current text
         System.out.println("Current text: " + editor.getCurrentText()); // Output: "Hello, World!"

         // Undo the last change
         editor.undo();
 
         // Get the current text again
         System.out.println("Current text: " + editor.getCurrentText()); // Output: "Hello, "
 
         // Add some more text
         editor.addText("How are you?");
 
         // Get the current text again
         System.out.println("Current text: " + editor.getCurrentText()); // Output: "Hello, How are you?"
     
        
    }
}
/*Design and implement a Java program that simulates the undo feature of a text editor
using a stack. The program should support adding text to the editor and undoing
changes. The stack should store strings, each representing a version of the text.
Implement methods for:
adding text to the editor : addText(String text)
undoing changes : undo()
getting the current text : getCurrentText() */


class TextEditor {
    private Stack<String> textHistory;
    private String currentText;

    public TextEditor() {
        textHistory = new Stack<>();
        currentText = "";
    }

    public void addText(String text) {
        currentText += text;
        textHistory.push(currentText);
    }

    public void undo() {
        if (!textHistory.isEmpty()) {
            textHistory.pop();
            if (!textHistory.isEmpty()) {
                currentText = textHistory.peek();
            } else {
                currentText = "";
            }
        }
    }

    public String getCurrentText() {
        return currentText;
    }
}
