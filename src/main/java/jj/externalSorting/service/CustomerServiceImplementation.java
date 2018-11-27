package jj.externalSorting.service;

import jj.externalSorting.model.Customer;
import jj.externalSorting.repository.CustomerRepository;
/* after having injection by setter we can remove this import: import jj.externalSorting.repository.HibernateCustomerRepositoryImplementation;*/

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    //this is where we want our business logic to reside
    //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImplementation();
    /* hard coded reference to customer service up here |^ */
    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
