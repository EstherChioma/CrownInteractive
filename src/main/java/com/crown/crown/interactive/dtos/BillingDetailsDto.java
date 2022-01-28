package com.crown.crown.interactive.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillingDetailsDto {


    private String accountNumber;

    private String tariff;
}
