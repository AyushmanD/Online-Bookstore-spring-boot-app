package com.online.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="books")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	@Column(name="book_name")
	private String title;
	private String author;
	private String category;
	@Column(name="book_price")
	private double price;
}
