package jj.externalSorting.repository;

import jj.externalSorting.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImplementation implements CustomerRepository {
//stub repository for now
    @Override
    public List<Customer> findAll(){

    List<Customer> customers = new ArrayList<>();
    Customer customer = new Customer();
    customer.setFirstName("Jelena");
    customer.setLastName("Jelisavcic");
    customers.add(customer);
    return customers;
    }
}
