package com.bookappp.testcases;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
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
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookappp.exception.BookNotFoundException;
import com.bookappp.model.Book;
import com.bookappp.service.IBookService;
import com.bookappp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderDetailsTest {

	
	@Mock
	IBookService bookService;
	@InjectMocks
	OrderDetails orderDetails = null;

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
	@DisplayName("testing by id")
	void testBookByAuthor() throws BookNotFoundException {
		String author = "kathy";
//		List<Book> booksByAuthor = Arrays.asList(book1,book2,book5);
		when(bookService.getByAuthor(author)).thenReturn(Arrays.asList(book1, book2, book5));
		List<Book> books = orderDetails.findByAuthor(author);
		assertNotNull(books);
	}

	@Test
	@DisplayName("testing by author - returning null")
	void testBookByAuthorNull() throws BookNotFoundException {
		 String author ="kathy";
		 when(bookService.getByAuthor(author)).thenReturn(null);
		 List<Book> bookList = orderDetails.findByAuthor(author);
		 assertNull(bookList);
	}
//@Test
//@DisplayName("Testing by author - sort by name")
//void testByAuthorSorted()throws BookNotFoundException{
//	 String author ="kathy";
//	 List<Book> bookList = new Arrays.asList(book2,book1,book5);
//}
@Test 
@DisplayName("Testing by author - empty list")
void testByAuthorException() throws BookNotFoundException {
	String author="paul";
	when(bookService.getByAuthor(author)).thenReturn(new ArrayList<>());
	assertThrows(BookNotFoundException.class, ()-> orderDetails.findByAuthor(author));
}


}