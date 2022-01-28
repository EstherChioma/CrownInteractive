package com.crown.crown.interactive.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {


    private Long id;

    private String firstName;

    private String lastName;

    private String email;

}
