package com.bookapp.service;

import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;

public interface IBookService {
	public abstract void addBook(Book book);
	public abstract void deleteBook(int bookId) throws IdNotFoundException;
	public abstract void updateBook(int bookId,double price) throws BookNotFoundException;
	public abstract Book getBookById(int bookId) throws IdNotFoundException;
	
	//called by User
	List<Book> getAllBooks();
	List<Book> getBookByAuthor(String author) throws AuthorNotFoundException;
	List<Book> getBookByCategory(String category) throws CategoryNotFoundException;
	

}
