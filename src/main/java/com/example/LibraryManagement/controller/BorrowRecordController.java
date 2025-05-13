package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.domain.BorrowRecord;
import com.example.LibraryManagement.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow")
public class BorrowRecordController {

    @Autowired
    private BorrowRecordService service;

    @GetMapping
    public List<BorrowRecord> getAllRecords() {
        return service.listAll();
    }

    @PostMapping
    public void borrowBook(@RequestBody BorrowRecord record) {
        service.save(record);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        service.delete(id);
    }
}

