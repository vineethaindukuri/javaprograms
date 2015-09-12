package com.javaexamples.singleton;

public class Connection {
	
	private static Connection conn ;
	
	private Connection() {
		//to track the number of times the constructor is being called.
		System.out.println("In constructor");
	}
	
	public static Connection getConnection(){
		
		
		if(conn ==null){
			conn = new Connection();
		}
		return conn;
	}

}
