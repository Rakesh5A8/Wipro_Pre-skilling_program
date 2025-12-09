package com.myfinbank.customer.entity;



import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "loan")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private Long customerId;

    private String loanType; // "PERSONAL", "HOME", "EDUCATION"

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;

    private Double annualInterestRate;

    private Integer months; 

    @Column(precision = 15, scale = 2)
    private BigDecimal emi; 

    private String status; // "APPLIED", "APPROVED", "DENIED" 

    private LocalDateTime appliedAt;
}
