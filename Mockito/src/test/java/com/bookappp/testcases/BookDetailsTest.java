package com.bookappp.testcases;

import static org.junit.jupiter.api.Assertions.*;

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
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookappp.service.BookDetails;
@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class BookDetailsTest {
	@Spy
    BookDetails bookDetails;
	
	@Mock
	BookDetails mbookDetails;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("using spy")
	void testShowBooks() {
		List<String> books = bookDetails.showBooks();
		assertEquals(3, books.size());
	}
	
	@Test
	@DisplayName("using mock")
	void testShowBooksMock() {
		List<String> books =mbookDetails.showBooks();
		assertEquals(3, books.size());
		
	}

}
