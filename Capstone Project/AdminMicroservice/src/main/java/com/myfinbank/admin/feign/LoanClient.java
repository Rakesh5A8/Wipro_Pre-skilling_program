package com.myfinbank.admin.feign;


import com.myfinbank.admin.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "CUSTOMER-MICROSERVICE")
public interface LoanClient {

    @GetMapping("/api/customers/loans")
    List<LoanDto> getAllLoans();

    @PutMapping("/api/customers/loans/{id}/approve")
    LoanDto approveLoan(@PathVariable Long id);

    @PutMapping("/api/customers/loans/{id}/reject")
    LoanDto rejectLoan(@PathVariable Long id);
}
