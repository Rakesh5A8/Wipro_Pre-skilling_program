package com.myfinbank.customer.service;



import com.myfinbank.customer.entity.Loan;

import java.math.BigDecimal;

public interface LoanService {
    Loan applyLoan(Long customerId, String loanType, BigDecimal amount, Double annualRate, Integer months);
    BigDecimal calculateEmi(BigDecimal principal, Double annualRate, Integer months);
}
