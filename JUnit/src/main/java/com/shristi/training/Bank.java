package com.shristi.training;



import com.shristi.exception.LimitExceededException;
import com.shristi.exception.MinimumValueException;
import com.shristi.exception.NegValueException;

public class Bank {
	double balance;

	

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public double deposit(int amount) throws Exception  {
		if(amount<0) {
			throw new NegValueException("Negative Value");
		}
		if (amount>2500) {
			throw new LimitExceededException("limitExceeded");
		}
		return balance + amount;
	}
	public double withdraw(int amount) throws Exception {
		if (amount<100 && amount>0) {
			throw new MinimumValueException("Minimum value");
		}
		if (amount>3000) {
			throw new LimitExceededException("LimitExceeded");
		}
		if (amount<0) {
			throw new NegValueException("Negative Value");
		}
		return balance -amount;
	}


}
