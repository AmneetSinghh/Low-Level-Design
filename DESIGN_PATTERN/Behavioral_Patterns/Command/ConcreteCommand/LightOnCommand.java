package DESIGN_PATTERN.Behavioral_Patterns.Command.ConcreteCommand;

import java.util.List;

import DESIGN_PATTERN.Behavioral_Patterns.Command.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.Receiver.Light;

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
