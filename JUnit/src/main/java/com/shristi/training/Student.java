package com.shristi.training;

import com.shristi.exception.InvalidValueException;
import com.shristi.exception.NegValueException;

public class Student {

	public int totalMarks(int marks1,int marks2,int marks3) throws NegValueException,InvalidValueException {
		if(marks1<0 || marks2<0  ||marks3<0) {
			throw new NegValueException("Negative Value");
		}
		 if(marks1>100 || marks2>100 || marks3>100) 
			throw new InvalidValueException("Invalid value");
		return marks1+marks2+marks3;
	    
	}
	public String getGrade(int[] marks) throws NegValueException {
		int sum = 0;
		int avg =0;
		
		if(marks != null) {
		for(int mark:marks ) {
			if(mark<0 || mark>100)
				throw new NegValueException("negative value");
			sum+=mark;
		}
		
		avg=sum/marks.length;
		if(avg>90)
			return "A";
		else if (avg>=80 && avg<=90)
			return"B";
		else if (avg>70 && avg<=80)
		       return "C";
		else if (avg<50)
			return"Fail";
		
		}
		
		return "not intialied" ;
	
		
	}
	}

