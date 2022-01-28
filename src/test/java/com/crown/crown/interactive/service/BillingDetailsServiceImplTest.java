package com.crown.crown.interactive.service;

import com.crown.crown.interactive.exceptions.AccountNumberAlreadyExistException;
import com.crown.crown.interactive.models.BillingDetails;
import com.crown.crown.interactive.repository.BillingDetailsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class BillingDetailsServiceImplTest {


    @Mock
    BillingDetailsRepository billingDetailsRepository;

    @InjectMocks
   BillingDetailsService billingDetailsService;
    private BillingDetails billingDetails;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        BillingDetails billingDetails = new BillingDetails();
    }

    @Test
    void testThatCustomerCanCreateBillingDetails()throws AccountNumberAlreadyExistException {
        when(billingDetailsRepository.save(billingDetails)).thenReturn(billingDetails);
        billingDetailsService.createBillingDetails(billingDetails);
        verify(billingDetailsRepository,times(1)).save(billingDetails);
    }
}