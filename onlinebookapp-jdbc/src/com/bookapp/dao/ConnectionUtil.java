package com.bookapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	static Connection connection;
	public static final String URL="jdbc:mysql://localhost:3306/dbtraining";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	public static Connection openConnection() {
		try {
			connection = DriverManager.getConnection(URL,USERNAME , PASSWORD);
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		} 
		return connection;
	}
	public static void closeConnection() {
		try {
			if(connection!=null)
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
