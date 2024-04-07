package com.appointment.booking.system.Appointment.booking.system.service;

import com.appointment.booking.system.Appointment.booking.system.enums.OperatorStatus;
import com.appointment.booking.system.Appointment.booking.system.model.Customer;
import com.appointment.booking.system.Appointment.booking.system.model.Operator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class OperatorService {

    List<Operator> operatorList = new ArrayList<>();

    public void save(){
        for(int i=1;i<=3;i++){
            Operator operator = new Operator();
            operator.setId(i);
            operator.setName("ServiceOperator_"+i);
            operator.setCurrentServingCustomer(null);
            operator.setStatus(OperatorStatus.IDLE);
            operator.setAgencyId(1);
            operatorList.add(operator);
        }
    }

    public List<Operator> getAll(){
        return operatorList;
    }

    public Operator getById(int id){
        return operatorList.get(id-1);
    }
}
