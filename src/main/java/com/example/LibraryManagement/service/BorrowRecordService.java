package com.example.LibraryManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LibraryManagement.domain.BorrowRecord;
import com.example.LibraryManagement.repository.BorrowRecordRepository;

import java.util.List;

@Service
public class BorrowRecordService {

    @Autowired
    private BorrowRecordRepository repo;

    public List<BorrowRecord> listAll() {
        return repo.findAll();
    }

    public void save(BorrowRecord record) {
        repo.save(record);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

