package design_pattern.Behavioral_Patterns.Command;
// see head first example if you want to save the history of commands. we can do that use invoker.
public class RefractoringGuruExample {
    public static void main(String args[]){
        Editor editor = new Editor();
        Button copyButton = new CopyButton();
        copyButton.setCommand(new CopyCommand(editor));
        ShortCut copyShortCut = new CopyShortCut();
        copyShortCut.setCommand(new CopyCommand(editor));
        copyButton.onClick();
        copyShortCut.onKeyPress();
        // we can make one shortCut class. by having if ctrl+z then do copy command.
    }
}





// command can be a abstract class.
interface Command{

    void execute();
}

class CopyCommand implements Command {

    Editor editor;
    public CopyCommand(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.getSelection();
        System.out.println("Starting the copy commmand");
        System.out.println("Doing lots of operations ");
        System.out.println("Copy completed");

    }
}

class SaveCommand implements Command {

    Editor editor;
    public SaveCommand(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.replaceSelection();
        System.out.println("Starting the save commmand");
        System.out.println("Doing lots of operations ");
        System.out.println("save completed");

    }
}


// receiver
class Editor{
    String selectedText = "text";
    public void getSelection(){
        //
    }
    public void deleteSelection(){
        //
    }
    public void replaceSelection(){
        //
    }
}









// invokers that use cut, copy and paste commands.
// these are click handlers they just know if we click ctrl+x then cut happens, they don't know how it  happens.
abstract class Button{
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    abstract void onClick();
}

class SaveButon extends Button{

    @Override
    void onClick() {
        command.execute();
    }
}

class CopyButton extends Button{

    @Override
    void onClick() {
        command.execute();

    }
}

class PasteButton extends Button{

    @Override
    void onClick() {
        command.execute();

    }
}

abstract class ShortCut{
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    abstract void onKeyPress();
}
class SaveShortCut extends ShortCut{

    @Override
    void onKeyPress() {
        command.execute();
    }
}

class CopyShortCut extends ShortCut{

    @Override
    void onKeyPress() {
        command.execute();

    }
}
class PasteShortCut extends ShortCut{

    @Override
    void onKeyPress() {
        command.execute();

    }
}

