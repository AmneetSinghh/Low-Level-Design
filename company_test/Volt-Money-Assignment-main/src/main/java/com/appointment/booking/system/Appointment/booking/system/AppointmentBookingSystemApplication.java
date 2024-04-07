package com.appointment.booking.system.Appointment.booking.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AppointmentBookingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentBookingSystemApplication.class, args);
	}

}
