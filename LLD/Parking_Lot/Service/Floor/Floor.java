package LLD.Parking_Lot.Service.Floor;

import LLD.Parking_Lot.Service.EntryGate.EntryGate;
import LLD.Parking_Lot.Service.ExitGate.ExitGate;

public class Floor {

    int id;
    EntryGate entryGate;

    ExitGate exitGate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }

    public ExitGate getExitGate() {
        return exitGate;
    }

    public void setExitGate(ExitGate exitGate) {
        this.exitGate = exitGate;
    }
}
