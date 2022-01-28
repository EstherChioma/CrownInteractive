package com.crown.crown.interactive.service;

import com.crown.crown.interactive.exceptions.CustomerAlreadyExistException;
import com.crown.crown.interactive.models.Customer;
import com.crown.crown.interactive.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public String createCustomer(Customer customerDto) throws CustomerAlreadyExistException {

        log.info("customer registration request --->{}", customerDto);

        if (customerRepository.findByEmail(customerDto.getEmail()) == null) {

            log.info("Customer is not registered");

            Customer customer = new Customer();
            customer.setFirstName(customerDto.getFirstName());
            customer.setLastName(customerDto.getLastName());
            customer.setEmail(customerDto.getEmail());
            customerRepository.save(customer);

            log.info("new customer saved --->{}", customer);

            return "new customer saved successfully";

        } else {
            throw new CustomerAlreadyExistException("a customer with email " + customerDto.getEmail() + "already exist!");
        }
    }

    @Override
    public Optional<Customer> getOneCustomerById(Long id) {

        Optional<Customer> customer =customerRepository.findById(id);
        return  customer;
    }

    @Override
    public List<Customer> getAllCustomers() {

        log.info("retrieves all customers");
        List<Customer> customerList = customerRepository.findAll();
        return customerList;
    }
    @Override
    public Customer findByCustomerId(Long id) {

        return customerRepository.findById(id).orElse(null);
    }
    }



