package com.example.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagement.domain.Admin;
import com.example.LibraryManagement.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Find admin by username
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    // Save new admin
    public void save(Admin admin) {
        adminRepository.save(admin);
    }
}

