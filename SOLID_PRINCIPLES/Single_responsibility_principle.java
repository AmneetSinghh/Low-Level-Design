package SOLID_PRINCIPLES;
import java.util.Arrays;

public class Single_responsibility_principle {
    public static void main(String[] args) {

        System.out.println("******   Single responsibility principle     ******");

    }
}
//https://www.baeldung.com/java-single-responsibility-principle
//Here we have two responsibilities: manipulating and printing the text.
class TextManipulator {
    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {
//        System.out.println(textManipulator.getText());
    }
}


// So we separate the text printer class,  so you can see we can have different methods/variations of printing the text.
 class TextPrinter {
    TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(textManipulator.getText().substring(startingIndex, endIndex));
    }
}


// Cohesion is very important for defining the single responsibility, because the closely related classes should not be separate,
//Cohesion often refers to how the elements of a module belong together. Related code should be close to each other to make it highly cohesive.

