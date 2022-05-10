package com.testcases.calcapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.shristi.training.Calculator;

public class CalculatorTest {
	Calculator call = null;
@BeforeAll
public static void  init() {
	System.out.println("runs before all the test cases");
}
@AfterAll
public static void cleanup() {
	System.out.println("runs after all the testcases");
}
@BeforeEach
public void setup() {
	call = new Calculator();
	System.out.println("runs before each test case");
}
@AfterEach
public void tearup() {
	call = null;
	System.out.println("runs after each test case");
}
@Test
public void testAdd() {
	int actualResult = call.add(20, 30);
	int expected =50;
	assertEquals(expected, actualResult);
}
@Test
public void testProduct() {
	assertEquals(90, call.product(9, 10),"Expected 90");
}
@Test
public void testDifference() {
	assertEquals(10, call.difference(30, 20),"Expected 10");
}
@Test
public void testGreetUser() {
assertEquals("welcome PRIYA",call.greetUser("priya") );  
 }

}
