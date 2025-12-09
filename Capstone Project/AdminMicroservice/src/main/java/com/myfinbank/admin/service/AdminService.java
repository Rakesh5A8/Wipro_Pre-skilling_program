package com.myfinbank.admin.service;

import com.myfinbank.admin.entity.Admin;

public interface AdminService {

    void register(Admin admin);

    Admin validateLogin(String username, String password);

    boolean existsByUsername(String username);
}