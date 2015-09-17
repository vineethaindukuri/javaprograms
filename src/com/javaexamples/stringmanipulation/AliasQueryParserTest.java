package com.javaexamples.stringmanipulation;

import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class AliasQueryParserTest {

	@Test
	public final void testGetAliasedNameToRealNameHashMap() {
		
		String given = "Address";
		HashMap<String,String> expectedResult = new HashMap<String,String> ();
		expectedResult.put(given, given);
		Assert.assertEquals(expectedResult, AliasQueryParser.getAliasedNameToRealNameHashMap(given));
		
	}
	
	@Test
	public final void testGetAliasedNameToRealNameHashMap2() {
		
		String given = "Address, Name";
		HashMap<String,String> expectedResult = new HashMap<String,String> ();
		expectedResult.put("Address", "Address");
		expectedResult.put("Name", "Name");
		Assert.assertEquals(expectedResult, AliasQueryParser.getAliasedNameToRealNameHashMap(given));
	}
	
	@Test
	public final void testGetAliasedNameToRealNameHashMap3() {
		
		String given = "Address, Name,[Products] as P,[Quantity] AS Q";
		HashMap<String,String> expectedResult = new HashMap<String,String> ();
		expectedResult.put("Address", "Address");
		expectedResult.put("Name", "Name");
		expectedResult.put("P", "[Products]");
		expectedResult.put("Q","[Quantity]");
		
		Assert.assertEquals(expectedResult, AliasQueryParser.getAliasedNameToRealNameHashMap(given));
	}
		@Test
		public final void testGetAliasedNameToRealNameHashMap4() {
			String given = "[Products]asP";
			HashMap<String,String> expectedResult = new HashMap<String,String> ();
			expectedResult.put(given,given);
			
			Assert.assertEquals(expectedResult, AliasQueryParser.getAliasedNameToRealNameHashMap(given));
		
		
	}
		

}
	


