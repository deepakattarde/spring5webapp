package com.dsa.example.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import com.dsa.example.springframework.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
