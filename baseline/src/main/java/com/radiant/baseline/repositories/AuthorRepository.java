package com.radiant.baseline.repositories;

import org.springframework.data.repository.CrudRepository;

import com.radiant.baseline.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

    
} 