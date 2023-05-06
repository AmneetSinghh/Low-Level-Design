package DESIGN_PATTERN.Command_Pattern.ConcreteCommand;

import DESIGN_PATTERN.Command_Pattern.Command.Command;
import DESIGN_PATTERN.Command_Pattern.Receiver.Sterio;

public class SterioOffWithCDCommand implements Command {
    Sterio sterio;
    public SterioOffWithCDCommand(Sterio sterio) {
        this.sterio = sterio;
    }

    @Override
    public void execute() {
        sterio.off();
        sterio.setCD();
        sterio.setVolume(0);
    }

    @Override
    public void undo() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(11);
    }
}
