package com.bookappp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.bookappp.exception.BookNotFoundException;
import com.bookappp.model.Book;

public class OrderDetails {

	
	IBookService bookService;
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	public List<Book> findByAuthor(String author) throws BookNotFoundException{
		List<Book> books = bookService.getByAuthor(author);
//		books = bookService.getByAuthor(author);
		if(books!=null) {
		if(books.isEmpty()) 
			throw new BookNotFoundException("Author not found");
		return books.stream().sorted(Comparator.comparing(Book::getTitle)).collect(Collectors.toList());
		}else
			return null;
	}
	
	public String orderBook(int bookId) {
		try {
		Book book = bookService.getById(bookId);
		if(book != null) 
			return "ordered succesfully";
		else
			return "Book not ordered";
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
	}
		return "Technical Issue - try again";
	}
	public String addBook(Book book) {
		if(book == null)
			return "Book not added";
		else {
		bookService.addBook(book);
		return "Book Added";
	}
	}
}
