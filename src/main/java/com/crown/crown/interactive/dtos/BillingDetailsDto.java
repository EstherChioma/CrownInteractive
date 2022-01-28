package com.crown.crown.interactive.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillingDetailsDto {


    private Long accountNumber;

    private Long tariff;
}
