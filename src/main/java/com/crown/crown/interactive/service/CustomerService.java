package com.crown.crown.interactive.service;

import com.crown.crown.interactive.exceptions.CustomerAlreadyExistException;
import com.crown.crown.interactive.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {

  String createCustomer(Customer customerDto) throws CustomerAlreadyExistException;

    Optional<Customer> getOneCustomerById(Long id);

    List<Customer> getAllCustomers();


}
