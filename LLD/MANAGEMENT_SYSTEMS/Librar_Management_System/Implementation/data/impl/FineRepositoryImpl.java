package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.impl;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.data.FineRepository;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Fine;

import java.util.ArrayList;
import java.util.List;

public class FineRepositoryImpl implements FineRepository {
    // fine
    List<Fine> fineList = new ArrayList<>();

    @Override
    public void collectFine(Fine fine) {
        fineList.add(fine);
    }
}
