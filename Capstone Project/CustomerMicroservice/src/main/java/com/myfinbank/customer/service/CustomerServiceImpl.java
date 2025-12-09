package com.myfinbank.customer.service;

import com.myfinbank.customer.entity.Customer;
import com.myfinbank.customer.repository.CustomerRepository;
import com.myfinbank.customer.repository.LoanRepository;
import com.myfinbank.customer.repository.FixedDepositRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder; 
    private final LoanRepository loanRepository; 
    private final FixedDepositRepository fdRepository; 

    // ---------- Sprint-1 ----------
    @Override
    public Customer register(Customer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        return customerRepository.save(customer);
    }

    @Override
    public Customer validateLogin(String username, String rawPassword) {
        Customer c = customerRepository.findByUsername(username);
        if (c != null && passwordEncoder.matches(rawPassword, c.getPassword())) {
            return c;
        }
        return null;
    }

    @Override
    public boolean existsByUsername(String username) {
        return customerRepository.existsByUsername(username);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer findByUsername(String username) {
        return customerRepository.findByUsername(username);
    }

    // ---------- Sprint-2: money ops ----------
    @Override
    @Transactional
    public Customer deposit(Long customerId, BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Amount must be > 0");

        Customer c = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        c.setBalance(c.getBalance().add(amount));
        return customerRepository.save(c);
    }

    @Override
    @Transactional
    public Customer withdraw(Long customerId, BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Amount must be > 0");

        Customer c = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        if (c.getBalance().compareTo(amount) < 0)
            throw new IllegalArgumentException("Insufficient balance");

        c.setBalance(c.getBalance().subtract(amount));
        return customerRepository.save(c);
    }

    @Override
    @Transactional
    public boolean transferAmount(String senderUsername, String receiverUsername, BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            return false;

        Customer sender = customerRepository.findByUsername(senderUsername);
        Customer receiver = customerRepository.findByUsername(receiverUsername);

        if (sender == null || receiver == null) return false;
        if (sender.getBalance().compareTo(amount) < 0) return false;

        sender.setBalance(sender.getBalance().subtract(amount));
        receiver.setBalance(receiver.getBalance().add(amount));

        customerRepository.save(sender);
        customerRepository.save(receiver);
        return true;
    }
}

