package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
	private static final String url="jdbc:mysql://localhost:3306/jdbc";
	private static final String username ="root" ;
	private static final String password ="root" ;
	
	public static Connection jdbcConnection() throws ClassNotFoundException, SQLException
	{
		
	 Class.forName("com.mysql.cj.jdbc.Driver" );
// Returns the Class object associated with the class
// or interface with the given string name. Invoking this method is equivalent to
		
 Connection con = DriverManager.getConnection(url,username,password );
 // Attempts to establish a connection to the given database URL. The DriverManager
 // attempts to select an appropriate driver from the set of registered JDBC drivers.
 
 return con;
	}
}
