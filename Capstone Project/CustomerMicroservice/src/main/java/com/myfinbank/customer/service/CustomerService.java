package com.myfinbank.customer.service;



import com.myfinbank.customer.entity.Customer;
import java.math.BigDecimal;

public interface CustomerService {

    // Sprint-1 methods
    Customer register(Customer customer);
    Customer validateLogin(String username, String rawPassword);
    boolean existsByUsername(String username);
    Customer findById(Long id);
    Customer findByUsername(String username);

    // Sprint-2 methods
    Customer deposit(Long customerId, BigDecimal amount);
    Customer withdraw(Long customerId, BigDecimal amount);
    boolean transferAmount(String senderUsername, String receiverUsername, BigDecimal amount);

}
