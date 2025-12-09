package com.myfinbank.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.myfinbank.admin.entity.Admin;
import com.myfinbank.admin.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
    }

    @Override
    public Admin validateLogin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);

        if (admin != null && passwordEncoder.matches(password, admin.getPassword())) {
            return admin;
        }
        return null;
    }

    @Override
    public boolean existsByUsername(String username) {
        return adminRepository.findByUsername(username) != null;
    }
}

