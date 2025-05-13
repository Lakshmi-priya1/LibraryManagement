package com.example.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.LibraryManagement.domain.BorrowRecord;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {
}

