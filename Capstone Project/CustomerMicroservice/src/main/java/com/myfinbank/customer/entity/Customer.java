package com.myfinbank.customer.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String username;

    private String email;

    private String password;

    // ---------- NEW FIELD ----------
    // Use BigDecimal for money; default 0.00
    @Column(precision = 15, scale = 2)
    private BigDecimal balance = BigDecimal.valueOf(0.00);

    private boolean active = true;
}