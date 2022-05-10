package com.bookapp.service;

import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;
import com.bookapp.exception.IdNotFoundException;



public class BookServiceImpl implements IBookService {
          IBookDao bookDao  = new BookDaoImpl();
	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	@Override
	public void deleteBook(int bookId) throws IdNotFoundException {
		bookDao.deleteBook(bookId);
		
	}

	@Override
	public void updateBook(int bookId, double price) throws BookNotFoundException {
		bookDao.updateBook(bookId, price);
		
	}

	@Override
	public Book getBookById(int bookId) throws IdNotFoundException {
		Book book = bookDao.findBookById(bookId);
		return book;
	
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = bookDao.findAllBooks();
		return books;
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws AuthorNotFoundException {
		List<Book> bookByAuthor = bookDao.findBookByAuthor(author);
		return bookByAuthor;
	}

	@Override
	public List<Book> getBookByCategory(String category) throws CategoryNotFoundException {
		List<Book> bookByCategory = bookDao.findBookByCategory(category);
		return bookByCategory;
	}

	

}
