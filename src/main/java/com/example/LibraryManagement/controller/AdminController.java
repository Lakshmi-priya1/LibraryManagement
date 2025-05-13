package com.example.LibraryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryManagement.domain.Admin;
import com.example.LibraryManagement.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Create a new admin
    @PostMapping("/register")
    public void registerAdmin(@RequestBody Admin admin) {
        adminService.save(admin);
    }
}

