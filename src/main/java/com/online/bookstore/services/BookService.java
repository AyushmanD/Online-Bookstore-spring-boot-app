package com.online.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bookstore.entities.Book;
import com.online.bookstore.reposiories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }

    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthorContaining(author);
    }

    public List<Book> searchByCategory(String category) {
        return bookRepository.findByCategory(category);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(int id, Book bookDetails) {
        Book book = getBookById(id);
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setCategory(bookDetails.getCategory());
        book.setPrice(bookDetails.getPrice());
        return bookRepository.save(book);
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
