package com.example.LibraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LibraryManagement.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

