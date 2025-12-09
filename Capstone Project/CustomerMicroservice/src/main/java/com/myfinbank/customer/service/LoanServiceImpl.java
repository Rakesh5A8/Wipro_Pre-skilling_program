package com.myfinbank.customer.service;


import com.myfinbank.customer.entity.Loan;
import com.myfinbank.customer.repository.LoanRepository;
import com.myfinbank.customer.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    @Override
    public Loan applyLoan(Long customerId, String loanType, BigDecimal amount, Double annualRate, Integer months) {
        Loan loan = Loan.builder()
                .customerId(customerId)
                .loanType(loanType)
                .amount(amount)
                .annualInterestRate(annualRate)
                .months(months)
                .status("APPLIED")
                .appliedAt(LocalDateTime.now())
                .emi(calculateEmi(amount, annualRate, months))
                .build();

        return loanRepository.save(loan);
    }

    @Override
    public BigDecimal calculateEmi(BigDecimal principal, Double annualRate, Integer months) {
        if (principal == null || months == null || months <= 0) return BigDecimal.ZERO;
        double P = principal.doubleValue();
        double r = (annualRate / 100.0) / 12.0;
        double numerator = P * r * Math.pow(1 + r, months);
        double denominator = Math.pow(1 + r, months) - 1;
        double emi = numerator / denominator;
        return BigDecimal.valueOf(emi).setScale(2, RoundingMode.HALF_UP);

    }
}
