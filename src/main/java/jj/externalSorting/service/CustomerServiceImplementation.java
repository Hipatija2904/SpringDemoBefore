package jj.externalSorting.service;

import jj.externalSorting.model.Customer;
import jj.externalSorting.repository.CustomerRepository;
import jj.externalSorting.repository.HibernateCustomerRepositoryImplementation;

import java.util.List;

public class CustomerServiceImplementation implements CustomerService {
    //this is where we want our business logic to reside
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImplementation();
    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll(); /*here we have a hard coded reference to our customer repository this is where spring starts to come in, so we don't have these pieces hardcoded inside our application*/
    }
}
