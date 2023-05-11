package DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.ConcreteCommand;

import DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Command.Command;
import DESIGN_PATTERN.Behavioral_Patterns.Command.HeadFirstExample.Receiver.Light;

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
