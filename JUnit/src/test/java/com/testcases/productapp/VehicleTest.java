package com.testcases.productapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Student;
@Tag("vehcle-details")
class VehicleTest {

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
	Student s1 =new Student();
	Student s2 = new Student();
	assertSame(s1, s2);
	}
@Test
@Tag("check")
void testCheck() {
	Student s1 = new Student();
	Student s3=s1;
	assertSame(s1, s3);
}
//repatitive checks

//@RepeatedTest(4)
@RepeatedTest(value = 4,name= "{displayName} for {currentRepetition} time of {totalRepetitions}")
@DisplayName("Testing Numbers")
void testName() {
	assertEquals(10, 10);
}

@RepeatedTest(value = 10,name="{displayName} for {currentRepetition}")
@DisplayName("Testing temperature")
void testTemperature() {
	double num1 = Math.random();
	long val1 =Math.round(num1*10);
	System.out.println(num1+" "+val1);
	double num2 = Math.random();
	long val2 = Math.round(val1*10);
	System.out.println(num2+" "+val2);
	assertEquals(val1,val2);
}
}
