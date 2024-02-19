package MachineCoding_HLD.Payment.PhonePe.implementation.model;

import java.util.UUID;

public class User {
    private UUID userId;
    private String name;
    private String email;
    private String phoneNumber; // international phone number. ( more than 10 digits )
    private String password; // ( encryption algorithm for storing into db -> bcrypt
    private String address;
    private String gender; // email.
}
