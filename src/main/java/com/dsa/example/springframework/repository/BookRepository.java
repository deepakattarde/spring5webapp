package com.dsa.example.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import com.dsa.example.springframework.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
