package design_patterns.Command_Pattern.ConcreteCommand;

import design_patterns.Command_Pattern.Command.Command;
import design_patterns.Command_Pattern.Receiver.Light;

import java.util.List;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
