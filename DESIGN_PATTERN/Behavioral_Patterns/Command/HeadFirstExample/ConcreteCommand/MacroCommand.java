package DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.ConcreteCommand;


import DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Command.Command;

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