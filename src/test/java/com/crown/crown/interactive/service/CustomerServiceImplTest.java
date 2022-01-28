package com.crown.crown.interactive.service;

import com.crown.crown.interactive.dtos.CustomerDto;
import com.crown.crown.interactive.exceptions.CustomerAlreadyExistException;
import com.crown.crown.interactive.models.Customer;
import com.crown.crown.interactive.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class CustomerServiceImplTest {

   @Mock
    CustomerRepository customerRepository;

   @InjectMocks
   CustomerService customerService = new CustomerServiceImpl();

   Customer customer;

   @BeforeEach
   void setUp(){
       MockitoAnnotations.openMocks(this);
       customer = new Customer();
       CustomerDto customerDto = new CustomerDto();
   }


    @Test
    void testThatWeCanSaveCustomerRepository() throws CustomerAlreadyExistException {
       when(customerRepository.save(customer)).thenReturn(customer);
       customerService.createCustomer(customer);
       verify(customerRepository,times(1)).save(customer);
    }

    @Test
    void getOneCustomerById() {
    }

    @Test
    void getAllCustomers() {
    }
}