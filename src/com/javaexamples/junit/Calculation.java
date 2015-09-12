package com.javaexamples.junit;

public class Calculation {
	
	public static int  addNumbers(int i,int j) throws InvalidInputException
	{
		 int sum = i+j;
		 if (i < 0 || j < 0) {
			 throw new InvalidInputException("both inputs should be positive numbers");
		 }
		 return sum;
	}
	
}
