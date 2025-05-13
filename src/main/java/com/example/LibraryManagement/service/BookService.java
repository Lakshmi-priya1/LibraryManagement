package com.example.LibraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LibraryManagement.domain.Book;
import com.example.LibraryManagement.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository repo;
    
    public List<Book> listAll() {
        return repo.findAll();
    }
     
    public void save(Book book) {
        repo.save(book);
    }
     
    public Book get(long id) {
    return repo.findById(id).orElse(null);
}
     
    public void delete(long id) {
        repo.deleteById(id);
    }
}

