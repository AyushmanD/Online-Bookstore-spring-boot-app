package com.online.bookstore.reposiories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.bookstore.entities.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
	List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorContaining(String author);
    List<Book> findByCategory(String category);
}
