package com.bookappp.service;

import java.util.List;

import com.bookappp.exception.BookNotFoundException;
import com.bookappp.model.Book;

public interface IBookService {
 
	List <Book> getByAuthor(String author) throws BookNotFoundException; 
	List<Book> getByLesserPrice(double price) ;
	Book getById(int bookId)throws BookNotFoundException;
	void addBook(Book book);
}
