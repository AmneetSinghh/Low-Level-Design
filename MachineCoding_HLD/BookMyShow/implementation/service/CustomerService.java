package MachineCoding_HLD.BookMyShow.implementation.service;

import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;

public interface CustomerService {
    void add(int id);
    Customer getById(int id);
}
