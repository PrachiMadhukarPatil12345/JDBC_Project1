package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import com.entity.Employee;
import com.utility.DBConnection;


public class EmployeeDAO
{
	public String insertEmployee(Employee employee) throws ClassNotFoundException, SQLException
	{
		Connection con = DBConnection.jdbcConnection();
		PreparedStatement pst = con.prepareStatement("insert into employee values( ?,?,?,?)" );
		
		pst.setInt(1, employee.getId());
		pst.setString(2, employee.getName());
		pst.setDouble(3, employee.getSalary() );
		pst.setString(4, employee.getDep());
		
		pst.executeUpdate(); // Executes the SQL statement in this PreparedStatement object, which must be an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; or an SQL statement that returns nothing, such as a DDL statement
		
		
		//System.out.println("Data inserted");
		return "Employee Inserted successfully";
	}
	
	
	/*
	 * public static void main(String[] args) throws ClassNotFoundException,
	 * SQLException { Employee e = new Employee(); e.setId(1); e.setName("Rupali");
	 * e.setSalary(90000); e.setDep("IT");
	 * 
	 * EmployeeDAO empdao= new EmployeeDAO(); empdao.insertEmployee(e);
	 * System.out.println("From DAO"); //new EmployeeDAO().insertEmployee( e ); }
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	
//	public void createTable() throws ClassNotFoundException, SQLException
//	{
//		 Connection con = DBConnection.jdbcConnection();
//		 Statement statement = con.createStatement();
//// The object used for executing a static SQL statement and returning the results it produces
//		 statement.execute(" create table employee (id int,name varchar(34),salary double, dep varchar(20)   )");
//	System.out.println("Table created");
//	}
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException
//	{
//		 new EmployeeDAO().createTable();
//	}
	
	
}
