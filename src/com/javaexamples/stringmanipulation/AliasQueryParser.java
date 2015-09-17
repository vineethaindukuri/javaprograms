package com.javaexamples.stringmanipulation;

import java.util.HashMap;

public class AliasQueryParser {
	
	public static HashMap<String, String> getAliasedNameToRealNameHashMap(String given)
	{
		String[] split = given.split(",");
		HashMap<String, String> hm = new HashMap<String, String>();

		for (String s : split) {
			if (s.contains(" as ")|| s.contains(" AS "))
				
			{
				String t = s.replaceAll(" as "," AS ");				
				String[] temp = t.split(" AS ");

				hm.put(temp[1], temp[0]);

			}
			else

			{
				hm.put(s.trim(), s.trim());

			}

		}
		return hm;
	}
	
	public static void main(String Args[]) {

		String given = "[Products].[FirstName] as Name,Lastname,Address";
		System.out.println(getAliasedNameToRealNameHashMap(given));
	}
}
