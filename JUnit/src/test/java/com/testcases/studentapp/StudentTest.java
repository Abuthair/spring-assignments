package com.testcases.studentapp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exception.InvalidValueException;
import com.shristi.exception.NegValueException;
import com.shristi.exception.NullValueException;
import com.shristi.training.Student;

class StudentTest {
 Student student = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	
	@AfterEach
	void tearDown() throws Exception {
		student = null;
	}

	
	@Test
	@DisplayName("Testing positive values")
	void testTotalMarks() throws NegValueException, InvalidValueException {
		assertEquals(260, student.totalMarks(80, 90, 90),"value donot match - exception 260");
	}
	@Test
	@DisplayName("Testing negative values")
	void testNegTotalMarks() {
		assertThrows(NegValueException.class, ()->student.totalMarks(-90, 82, 92));
		
	}
	@Test
	@DisplayName("Testing greater than 100")
	void testGreTotalMarks() {
		assertThrows(InvalidValueException.class, ()->student.totalMarks(101, 90, 102));
	}
	@Test
	@DisplayName("Testing grade - A")
	void testGetGradeA() {
		int[] marks= {90,93,95};
		
		assertEquals("A",student.getGrade(marks));
	
	
}
	@Test
	@DisplayName("Testing grade - B")
	void testGetGradeB() {
		int[] marks= {82,85,86};
		assertEquals("B", student.getGrade(marks));
	}
	@Test
	@DisplayName("Testing grade - C")
	void testGetGradeC()  {
		int[] marks= {72,75,70};
		assertEquals("C", student.getGrade(marks));
		
	}
	@Test
	@DisplayName("Testing grade - Fail")
	void testGetGradeFail() {
		int[] marks = {45,45,45};
		assertEquals("Fail", student.getGrade(marks));
	}
	@Test
	@DisplayName("Testing grade - Negative value")
	void testGetGradeNegative() {
		int[] marks = {-45,-50,-34};
		assertThrows(NegValueException.class, ()->student.getGrade(marks));
	}
	@Test
	@DisplayName("Testing grade -Null value")
	void testGetGradeNull() {
		int[] marks = null;
		assertEquals("not intialied",student.getGrade(marks));
	}
	
}