package com.online.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.bookstore.entities.Book;
import com.online.bookstore.services.BookService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/book")
public class BookController {
	@Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/search/title")
    public List<Book> searchByTitle(@RequestParam String title) {
        return bookService.searchByTitle(title);
    }

    @GetMapping("/search/author")
    public List<Book> searchByAuthor(@RequestParam String author) {
        return bookService.searchByAuthor(author);
    }

    @GetMapping("/search/category")
    public List<Book> searchByCategory(@RequestParam String category) {
        return bookService.searchByCategory(category);
    }

    @PostMapping()
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
