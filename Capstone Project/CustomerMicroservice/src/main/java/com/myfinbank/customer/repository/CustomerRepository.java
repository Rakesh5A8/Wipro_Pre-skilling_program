package com.myfinbank.customer.repository;



import com.myfinbank.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByUsername(String username);

    Customer findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);
}
