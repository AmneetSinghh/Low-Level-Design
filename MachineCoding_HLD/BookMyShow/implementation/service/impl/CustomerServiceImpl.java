package MachineCoding_HLD.BookMyShow.implementation.service.impl;

import MachineCoding_HLD.BookMyShow.implementation.data.Repository;
import MachineCoding_HLD.BookMyShow.implementation.model.user.Customer;
import MachineCoding_HLD.BookMyShow.implementation.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    Repository repository = Repository.getInstance();
    @Override
    public void add(int id) {
        Customer customer = new Customer();
        customer.init(id);
        repository.add(customer);
    }

    @Override
    public Customer getById(int id) {
        return repository.getById(id);
    }
}
