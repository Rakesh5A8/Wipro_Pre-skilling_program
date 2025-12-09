package com.myfinbank.customer.dto;


import java.math.BigDecimal;

import com.myfinbank.customer.entity.Customer;

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
    
    
    public static CustomerDto fromEntity(Customer c) {
        CustomerDto dto = new CustomerDto();

        dto.setId(c.getId());
        dto.setFirstName(c.getFirstName());
        dto.setLastName(c.getLastName());
        dto.setUsername(c.getUsername());
        dto.setEmail(c.getEmail());
        dto.setActive(c.isActive());
        dto.setBalance(c.getBalance());

        return dto;
    }
}

