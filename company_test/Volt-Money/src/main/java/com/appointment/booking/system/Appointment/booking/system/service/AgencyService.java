package com.appointment.booking.system.Appointment.booking.system.service;
import com.appointment.booking.system.Appointment.booking.system.model.Agency;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AgencyService {

    List<Agency> agencyList = new ArrayList<>();

    public void save(){
        agencyList.add(Agency.builder()
                .id(1)
                .name("Agency_1")
                .build());
    }


}
