package com.myfinbank.admin.dto;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoanDto {

    private Long id;
    private Long customerId;

    private String loanType;
    private BigDecimal amount;

    private Double annualInterestRate;
    private Integer months;
    private BigDecimal emi;

    private String status; // APPLIED, APPROVED, DENIED
    private LocalDateTime appliedAt;
}
