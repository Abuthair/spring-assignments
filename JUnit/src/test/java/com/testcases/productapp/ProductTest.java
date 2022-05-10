package com.testcases.productapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProductTest {

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
	@Tag("creation")
	void testAdd() {
		String s1="Hello";
		String s2="Hello";
		assertSame(s1, s2);
	}
	@Test
	@Tag("all-products")
	void testByProduct() {
		int[] number= null;
		assertNull(number,"number is not null");
	}
	@Test
	@Tag("by-brand")
	void testByBrand() {
		int[] number= null;
		assertNull(number,"number is not null");
	}

}
