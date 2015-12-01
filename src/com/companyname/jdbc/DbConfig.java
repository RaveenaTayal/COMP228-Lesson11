package com.companyname.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Configuration utility class
public class DbConfig {

	//PRIVATE CONSTANTS+++++++++++++++++++
	private static final String USERNAME="raveena";
	private static final String PASSWORD="123456";
	private static String CONN_STRING="jdbc:mysql://localhost:8080/moviedb";
	
	//Utility method that connects to mysql database
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
	}
	
	//Utility methods that display errors in more detail
	public static void DisplayException(SQLException exception)
	{
		System.err.println("Error Message: "+exception.getMessage());
		System.err.println("Error code: "+exception.getErrorCode());
		System.err.println("SQL state: "+exception.getSQLState());
	}
	

}
