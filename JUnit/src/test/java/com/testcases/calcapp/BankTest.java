package com.testcases.calcapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exception.LimitExceededException;
import com.shristi.exception.MinimumValueException;
import com.shristi.exception.NegValueException;
import com.shristi.training.Bank;

class BankTest {
     Bank bank = null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bank = new Bank(2000);
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
	}


	@Test
	@DisplayName("postive value")
	void testPostiveDeposit() throws Exception {
		int amount =2000;
	assertEquals(4000,bank.deposit(amount));
	}
	@Test
	@DisplayName("Negative value")
	void testNegativeDeposit() {
		int amount = -2000;
	   assertThrows(NegValueException.class,()->bank.deposit(amount));
	}
	@Test
	@DisplayName("postive value")
	void testPostiveWithdraw() throws Exception {
		int amount =1000;
		assertEquals(1000,bank.withdraw(amount));
	}
	
	@Test
	@DisplayName("Negative value")
	void TestNegativeWithdraw() {
		int amount =-2000;
		assertThrows(NegValueException.class,()->bank.withdraw(amount));
	}
	
	@Test
	@DisplayName("LimitExceeded")
	void TestLimitExceedDeposit() {
		int amount =3000;
		assertThrows(LimitExceededException.class,()->bank.deposit(amount));
		
	}
	@Test
	@DisplayName("LimitExceeded")
	void testLimitExceedwithdraw() {
		int amount = 3500;
		assertThrows(LimitExceededException.class,()->bank.withdraw(amount));
	}
	@Test
	@DisplayName("Minimum Value")
	void testMinimumwithdraw() {
		int amount = 50;
		assertThrows(MinimumValueException.class,()->bank.withdraw(amount));
	}

}
