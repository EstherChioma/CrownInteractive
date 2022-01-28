package com.crown.crown.interactive.service;

import com.crown.crown.interactive.dtos.CustomerDto;
import com.crown.crown.interactive.models.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    void createCustomer() {
        Customer customer = new Customer();
        CustomerDto customerDto = new CustomerDto();
        customerService.createCustomer(customer);

        assertThat(customerDto).isNotNull();

    }

    @Test
    void getOneCustomerById() {

    }

    @Test
    void getAllCustomers() {
    }
}