package com.radiant.baseline.repositories;

import org.springframework.data.repository.CrudRepository;

import com.radiant.baseline.domain.Book;

public interface BookRepository extends CrudRepository<Book, String> {
    
}
