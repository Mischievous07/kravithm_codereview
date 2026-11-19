package com.soit.libraryinventory.dao;

import com.soit.libraryinventory.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
