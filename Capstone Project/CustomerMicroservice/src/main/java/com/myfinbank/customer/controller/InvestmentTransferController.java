package com.myfinbank.customer.controller;



import com.myfinbank.customer.entity.Customer;
import com.myfinbank.customer.repository.CustomerRepository;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class InvestmentTransferController {

    private final CustomerRepository customerRepository;

    @GetMapping("/transfer-investment")
    public String showInvestmentTransferPage(Model model) {
        model.addAttribute("success", null);
        model.addAttribute("error", null);
        return "customer/transfer-investment";
    }

    @PostMapping("/transfer-investment")
    public String processInvestmentTransfer(
            @RequestParam String category,     // Loan / FD / RD
            @RequestParam BigDecimal amount,
            HttpSession session,
            Model model) {

        Long custId = (Long) session.getAttribute("customerId");
        if (custId == null) return "redirect:/login";

        Customer customer = customerRepository.findById(custId).orElse(null);
        if (customer == null) return "redirect:/login";

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            model.addAttribute("error", "Amount must be greater than zero");
            return "customer/transfer-investment";
        }

        if (customer.getBalance().compareTo(amount) < 0) {
            model.addAttribute("error", "Insufficient balance");
            return "customer/transfer-investment";
        }

        // Deduct amount
        customer.setBalance(customer.getBalance().subtract(amount));
        customerRepository.save(customer);

        // Temporary transaction ID (full implementation in Sprint 3)
        String txnId = UUID.randomUUID().toString().substring(0, 8);

        model.addAttribute("success",
                "Successfully transferred ₹" + amount + " to " + category +
                        ". Transaction ID: " + txnId);

        return "customer/transfer-investment";
    }
}
