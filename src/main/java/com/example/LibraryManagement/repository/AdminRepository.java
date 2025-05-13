package com.example.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagement.domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
