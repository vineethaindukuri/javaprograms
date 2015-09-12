package com.javaexamples.singleton;

/*
 * Simple example for Singleton
 */
public class ConnectionCaller {

	public static void main(String[] args) {
		//even though the connector
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
		if(c1==c2){
			System.out.println("Both getConnection calls return the same object");
		}else{
			System.out.println("Both getConnection calls did not return the same object");
		}
		//the following is syntax error as the constructor is private
		//Connection connection = new Connection();
	}

}
