package com.crown.crown.interactive.service;

import com.crown.crown.interactive.exceptions.AccountNumberAlreadyExistException;
import com.crown.crown.interactive.models.BillingDetails;
import org.springframework.stereotype.Service;

@Service
public interface BillingDetailsService {

    String createBillingDetails(BillingDetails billingDetailsDto) throws AccountNumberAlreadyExistException;


}
