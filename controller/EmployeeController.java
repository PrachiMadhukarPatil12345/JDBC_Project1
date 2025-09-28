package com.controller;

import java.sql.SQLException;
import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController
{
	
	EmployeeService es = new EmployeeService();
	
	
	public String insert(Employee employee)       throws ClassNotFoundException, SQLException
	{
		String msg = es.insertEmp(employee);
		return msg;
	}
	 
}
