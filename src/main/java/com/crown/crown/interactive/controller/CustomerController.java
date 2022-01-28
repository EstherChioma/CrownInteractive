package com.crown.crown.interactive.controller;

import com.crown.crown.interactive.exceptions.CustomerAlreadyExistException;
import com.crown.crown.interactive.models.Customer;
import com.crown.crown.interactive.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {



    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    ResponseEntity<?> CustomerRegistration(@RequestBody Customer customerDto){
    try
    {
        customerService.createCustomer(customerDto);
    }catch (CustomerAlreadyExistException e){

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }return  ResponseEntity.ok().body("registration was successful");

    }

    @GetMapping("/getCustomer")
    public Optional<Customer> getCustomerById(@PathVariable Long id){
        return customerService.getOneCustomerById(id);
    }

    @GetMapping("/retrieveAll")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

}
