package design_pattern.Behavioral_Patterns.Command.HeadFirstExample.ConcreteCommand;

import design_pattern.Behavioral_Patterns.Command.HeadFirstExample.Command.Command;
import design_pattern.Behavioral_Patterns.Command.HeadFirstExample.Receiver.Light;

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