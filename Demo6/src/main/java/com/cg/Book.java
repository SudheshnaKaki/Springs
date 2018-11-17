package com.cg;
import javax.annotation.*;


public class Book {
	private String isbn;
	private String year;

	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setUp() {
		System.out.println("Method is Setup");
	}

	public void cleanUp() {
		System.out.println("Method is Cleaned");
	}
	@PostConstruct
	public void customInit() {
		System.out.println("Method is initialized");
	}
	@PreDestroy
	public void customDestroy() {
		System.out.println("Method is Destroyed");
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + ", author=" + author
				+ "]";
	}

	
}
