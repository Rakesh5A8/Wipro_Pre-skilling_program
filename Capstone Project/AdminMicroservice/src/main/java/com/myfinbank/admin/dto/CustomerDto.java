package com.myfinbank.admin.dto;



import java.math.BigDecimal;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private boolean active;
    private BigDecimal balance;
}
