package com.myfinbank.customer.controller;


import com.myfinbank.customer.entity.Customer;
import com.myfinbank.customer.repository.CustomerRepository;
import com.myfinbank.customer.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final CustomerRepository customerRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    // ----------- JWT LOGIN FOR POSTMAN + ADMIN -----------
    @PostMapping("/token")
    public String generateToken(@RequestParam String username,
                                @RequestParam String password) {

        Customer customer = customerRepository.findByUsername(username);
        if (customer == null) {
            return "Invalid username or password";
        }

        if (!passwordEncoder.matches(password, customer.getPassword())) {
            return "Invalid username or password";
        }

        return jwtUtil.generateToken(username);
    }
}
