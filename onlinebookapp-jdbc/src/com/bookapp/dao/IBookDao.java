package com.bookapp.dao;

import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;

public interface IBookDao {
	
	
	
	
	//called by Admin
	public abstract void addBook(Book book);
	public abstract void deleteBook(int bookId) throws IdNotFoundException;
	public abstract void updateBook(int bookId,double price) throws BookNotFoundException;
	public abstract Book findBookById(int bookId) throws IdNotFoundException;
	
	//called by User
	List<Book> findAllBooks();
	List<Book> findBookByAuthor(String author) throws AuthorNotFoundException;
	List<Book> findBookByCategory(String category) throws CategoryNotFoundException;
	
}
