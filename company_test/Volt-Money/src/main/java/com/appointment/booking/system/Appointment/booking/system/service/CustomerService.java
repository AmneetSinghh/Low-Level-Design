package com.appointment.booking.system.Appointment.booking.system.service;
import com.appointment.booking.system.Appointment.booking.system.enums.CustomerOnboardingSource;
import com.appointment.booking.system.Appointment.booking.system.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    private final List<Customer> customerList = new ArrayList<>();

    public void save(){
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("volt_money");
        customer.setEmail("volt_money@gmail.com");
        customer.setPhoneNumber("991407599");
        customer.setOnboardingSource(CustomerOnboardingSource.BOT);
        customer.setAgencyId(1);
        customerList.add(customer);
    }

    public List<Customer> getAll(){
        return customerList;
    }
}
