package DESIGN_PATTERN.Command_Pattern.ConcreteCommand;

import DESIGN_PATTERN.Command_Pattern.Command.Command;
import DESIGN_PATTERN.Command_Pattern.Receiver.Sterio;

public class SterioOnWithCDCommand implements Command {
    Sterio sterio;
    public SterioOnWithCDCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(11);
    }

    @Override
    public void undo() {
        sterio.off();
        sterio.setCD();
        sterio.setVolume(0);
    }
}