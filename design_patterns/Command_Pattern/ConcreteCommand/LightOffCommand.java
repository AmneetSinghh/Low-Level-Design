package design_patterns.Command_Pattern.ConcreteCommand;

import design_patterns.Command_Pattern.Command.Command;
import design_patterns.Command_Pattern.Receiver.Light;

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