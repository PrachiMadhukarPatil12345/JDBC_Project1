package com.service;

import java.sql.SQLException;

import com.dao.EmployeeDAO;
import com.entity.Employee;

public class EmployeeService
{ 
	EmployeeDAO ed= new EmployeeDAO();
	
	public String insertEmp(Employee employee) throws ClassNotFoundException, SQLException
	{
		String msg = ed.insertEmployee(employee);
	   return msg;
	}
}
