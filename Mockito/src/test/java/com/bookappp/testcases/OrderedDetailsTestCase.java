package com.bookappp.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.util.DefaultMockingDetails;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookappp.exception.BookNotFoundException;
import com.bookappp.model.Book;
import com.bookappp.service.IBookService;
import com.bookappp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)

class OrderedDetailsTestCase {

	@Mock
	IBookService bookService;

	@InjectMocks
	OrderDetails orderDetails;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	Book book1, book2, book3, book4, book5;

	@BeforeEach
	void setUp() throws Exception {
		orderDetails = new OrderDetails();
		orderDetails.setBookService(bookService);
		book1 = new Book(1, "java", "kathy", 900);
		book2 = new Book(2, "JSP", "kathy", 200);
		book3 = new Book(3, "seven habits", "Steve", 300);
		book4 = new Book(4, "sam club", "Robin", 800);
		book5 = new Book(5, "spring", "kathy", 1000);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOrderBook() throws BookNotFoundException {
		int bookId = 1;
		doReturn(book1).when(bookService).getById(bookId);
		String actual = orderDetails.orderBook(bookId);
		assertEquals("ordered succesfully", actual);
	}

	@Test
	@DisplayName("testing book return as null")
	void testOrderBookNull() throws BookNotFoundException {
		int bookId = 1;
		doReturn(null).when(bookService).getById(bookId);
		String actual = orderDetails.orderBook(bookId);
		assertEquals("Book not ordered", actual);
	}

	@Test
	@DisplayName("Testing book returning exception")
	void testOrderBookException() throws BookNotFoundException {
		int bookId = 1;
		doThrow(new BookNotFoundException()).when(bookService).getById(bookId);
		String actual = orderDetails.orderBook(bookId);
		assertEquals("Technical Issue - try again", actual);
	}

//	mocking a method that returns nothing - void return type

	@Test
	@DisplayName("Testing add book with void type")
	void TestAddBook() {
		doNothing().when(bookService).addBook(book1);
		String actual = orderDetails.addBook(book1);
		assertEquals("Book Added", actual);
	}

	@Test
	@DisplayName("testing add null book with void type")
	void testAddBookNull() {
		String actual = orderDetails.addBook(null);
		assertEquals("Book not added", actual);
	}

	@Test
	@DisplayName("Testing verify")
	void testVerify() throws BookNotFoundException {
		String author = "Kathy";

		List<Book> expected = Arrays.asList(book2, book1, book5);

		when(bookService.getByAuthor(author)).thenReturn(Arrays.asList(book2, book1, book5));
		List<Book> actualList = orderDetails.findByAuthor(author);
		assertEquals(expected.toString(), actualList.toString());
	
		assertNotNull(actualList);

		when(bookService.getByAuthor(author)).thenReturn(null);
		List<Book> actual = orderDetails.findByAuthor(author);
		assertNull(actual);

		Mockito.verify(bookService, times(2)).getByAuthor(author);
		Mockito.verify(bookService, atLeastOnce()).getByAuthor(author);
		Mockito.verify(bookService, atLeast(2)).getByAuthor(author);
	}
}
