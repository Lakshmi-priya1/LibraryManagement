package com.example.LibraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.LibraryManagement.domain.Book;
import com.example.LibraryManagement.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.listAll();
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        service.save(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable Long id) {
        book.setId(id);
        service.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.delete(id);
    }
}
