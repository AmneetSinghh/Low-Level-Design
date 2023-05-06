package DESIGN_PATTERN.Behavioral_Patterns.Command.Invoker;

import DESIGN_PATTERN.Behavioral_Patterns.Command.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.ConcreteCommand.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    // null checks are skilled by using this empty NoCommand;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonClicked(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];// we have to set it to the previous command.
    }

    public void offButtonClicked(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];// we have to set it to the previous command.
    }


    public void undoButtonWasPressed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n********* Remote Control *******\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+ i + "] "+ onCommands[i].getClass().getSimpleName() + "   "+ offCommands[i].getClass().getSimpleName()+  "  "+ undoCommand.getClass().getSimpleName()+ "\n");
        }
        return stringBuffer.toString();
    }
}
