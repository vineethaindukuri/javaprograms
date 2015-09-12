package com.javaexamples.junit;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test	
	public  void testCalcPositiveCase() throws InvalidInputException 
	{
		int expsum = 30;
		int actsum = Calculation.addNumbers(10, 20);
		Assert.assertEquals(actsum,expsum);
	}

	@Test(expected=InvalidInputException.class)
	public  void testCalcExceptionHandling() throws InvalidInputException 
	{
		Calculation.addNumbers(20, -1);
	}
}
