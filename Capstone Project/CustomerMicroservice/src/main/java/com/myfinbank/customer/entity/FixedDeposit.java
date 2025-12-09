package com.myfinbank.customer.entity;


import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "fixed_deposit")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FixedDeposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;

    private Double annualInterestRate;

    private Integer months;

    private LocalDateTime createdAt;
}
