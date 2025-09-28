package com.main;
import com.entity.Employee;
import java.sql.SQLException;
import com.controller.EmployeeController;
import com.entity.Employee;

public class Main
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		 EmployeeController ec = new  EmployeeController ();
		 
			
			  Employee e = new Employee ();
			  e.setId(3); e.setName("ramal"); e.setSalary(80000); e.setDep("CSE");
			  
			  Employee e1 = new Employee (); 
			  e1.setId(4); e1.setName("komal2"); e1.setSalary(50000); e1.setDep("EE");
			  
			  Employee e3 = new Employee (); 
			  e3.setId(5); e3.setName("Snehal"); e3.setSalary(70000); e3.setDep("Agri");
			  
			  Employee e4 = new Employee (); 
			  e4.setId(5); e4.setName("rudraa"); e4.setSalary(98000); e4.setDep("kg");
			 
			 
			 
		String msg=  ec.insert(e );
		String msg2 = ec.insert(e1 );
		String msg3 = ec.insert(e3 );
		String msg4 = ec.insert(e4 );
		System.out.println(msg);
		System.out.println(msg2);
		System.out.println("from main");
	}
	

}
