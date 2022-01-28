package com.crown.crown.interactive.service;

import com.crown.crown.interactive.exceptions.AccountNumberAlreadyExistException;
import com.crown.crown.interactive.models.BillingDetails;
import com.crown.crown.interactive.repository.BillingDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BillingDetailsServiceImpl implements BillingDetailsService {

    @Autowired
    BillingDetailsRepository billingDetailsRepository;


    @Override
    public String createBillingDetails(BillingDetails billingDetailsDto) throws AccountNumberAlreadyExistException {

        log.info("Billing registration request --->  {}", billingDetailsDto);

        if(billingDetailsRepository.findByAccountNumber(billingDetailsDto.getAccountNumber()) == null){

            log.info("account number is  not registered");

            BillingDetails billingDetails = new BillingDetails();

            billingDetails.setAccountNumber(billingDetailsDto.getAccountNumber());
            billingDetails.setTariff(billingDetailsDto.getTariff());

            billingDetailsRepository.save(billingDetails);

            log.info("billing details saved ---> {}", billingDetails);

        }
        else throw new AccountNumberAlreadyExistException(" a customer with this account number" + billingDetailsDto.getAccountNumber() + " already exist");
        return "Billing details saved successfully";
    }


}
