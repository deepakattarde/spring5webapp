package com.dsa.example.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import com.dsa.example.springframework.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
