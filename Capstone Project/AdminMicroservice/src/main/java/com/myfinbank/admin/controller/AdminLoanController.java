package com.myfinbank.admin.controller;

import com.myfinbank.admin.feign.LoanClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/loans")
public class AdminLoanController {

    private final LoanClient loanClient;

    @GetMapping
    public String listLoans(Model model) {
        model.addAttribute("loans", loanClient.getAllLoans());
        return "admin/loan-list";
    }

    @PostMapping("/{id}/approve")
    public String approve(@PathVariable Long id) {
        loanClient.approveLoan(id);
        return "redirect:/admin/loans";
    }

    @PostMapping("/{id}/reject")
    public String reject(@PathVariable Long id) {
        loanClient.rejectLoan(id);
        return "redirect:/admin/loans";
    }
}
