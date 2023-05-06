package DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command_Pattern.Receiver.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }


}