package com.javaexamples.junit;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test	
	public  void testCalcPositiveCase() throws InvalidInputException 
	{
		Assert.assertEquals(Calculation.addNumbers(10, 20),30);
	}

	@Test(expected=InvalidInputException.class)
	public  void testCalcExceptionHandling() throws InvalidInputException 
	{
		Calculation.addNumbers(20, -1);
	}
}
