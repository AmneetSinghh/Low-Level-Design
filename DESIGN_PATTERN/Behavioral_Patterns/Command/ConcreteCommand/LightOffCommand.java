package DESIGN_PATTERN.Behavioral_Patterns.Command.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.Receiver.Light;

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