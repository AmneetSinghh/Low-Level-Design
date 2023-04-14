package DESIGN_PATTERN.Command_Pattern.ConcreteCommand;


import javax.crypto.Mac;

import DESIGN_PATTERN.Command_Pattern.Command.Command;

public class MacroCommand  implements Command{
    Command[] commands;
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    public void execute(){
        System.out.println("Execuring Macro Command");
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    public void undo(){
        System.out.println("Undo Macro Command");
        for(int i=0;i<commands.length;i++){
            commands[i].undo();
        }
    }
}