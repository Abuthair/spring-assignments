package com.shristi.training;

public class Calculator {
 
	public int add(int a,int b) {
		return a+b;
		
	}
	public int  product(int a ,int b) {
		return a*b;
		
	}
	public double difference(int a ,int b) {
		return a-b;
	}
	
	public String greetUser(String name) {
		return "welcome "+name.toUpperCase() ;
		
	}
}
