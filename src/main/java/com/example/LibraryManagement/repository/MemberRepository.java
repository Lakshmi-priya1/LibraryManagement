package com.example.LibraryManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryManagement.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

