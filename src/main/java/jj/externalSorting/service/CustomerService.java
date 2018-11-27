package jj.externalSorting.service;

import jj.externalSorting.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    /* autowired by name, constructor injection */
}
