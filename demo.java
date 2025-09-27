package JDBC_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class Student
{
	private int id;
	private String name;
	private String Dept;
	private double marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}














public class demo
{
	 static void GetAllRecords() throws ClassNotFoundException, SQLException
	 // static void updateData(int id) throws ClassNotFoundException, SQLException
	 
	 
	 // static void insertdataUsingMethodParam(Student student) throws ClassNotFoundException, SQLException
	 
	 
	// static void insertdataUsingMethodParam(int id,String name,String Dept,double marks) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","root", "root");
		
		System.out.println("Connection Established Driver loaded");
		
		Statement st = con.createStatement();
		
		// st.execute("create database Students");
		// st.execute(" create table Student (id int,name varchar(20),Dept varchar(20),marks double ) ");
		//st.execute("DELETE FROM  Student WHERE " 'id'"=1)");
		//st.execute("INSERT INTO Student VALUES (11,'PRACHI','IT',200)");
		// st.execute("INSERT INTO Student VALUES (12,'AadI','IT',740), (13,'shamI','IT',740),(14,'Iran','IT',740),(15,'sami','csse',920)");
		
// st.execute( "INSERT INTO Student VALUES ('"+student.getId()+"','"+student.getName()+"','"+student.getDept()+"','"+student.getMarks()+"')" );
		//st.execute("UPDATE Student set marks=   '"+student.getMarks()+"'   , name= '"+ student.getName()+"'    where id='"+student.getId() +"'  ");
		
		 ResultSet rs = st.executeQuery("select * from Student");
		 while(rs.next() )
		 {
			 int int1 = rs.getInt("Id");
			 String string = rs.getString("name");
			 String string2 = rs.getString("Dept");
			 double double1 = rs.getDouble("marks");
			 
			 System.out.println("ID : " + int1);
			 System.out.println("NAME : " + string);
			 System.out.println("DEPT : " + string2);
			 System.out.println("MARKS : " + double1);
			 
			 System.out.println("***************************************");
		 }
		 
		//st.execute("delete from student where id= '"+id+"'     ");
		// st.execute("truncate table Student");
		
		System.out.println(" data fetched ");
	}

	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Student student= new Student();
		student.setId(11);
		student.setName("PrachiPatil");
		student.setDept("AI");
		student.setMarks(99);
		
		GetAllRecords();
		
		// deleteAll();
		
		
		
		
		
		
		
		
		
//		Student student= new Student();
//		student.setId(61);
//		student.setName("kartik");
//		student.setDept("AI");
//		student.setMarks(90);
		
		// insertdataUsingMethodParam(student);
		 

//		Student 2= new Student();
//		s2.setId(61);
//		s2.setName("kartik");
//		s2.setDept("AI");
//		s2.setMarks(90);
		
		// insertdataUsingMethodParam(s2);
		 
		
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter id");
//		int id=sc.nextInt();
//		
//		System.out.println("Enter name");
//		String name=sc.next();
//		
//		System.out.println("Enter Dept");
//		String Dept =sc.next();
//		
//		System.out.println("Enter marks");
//		double marks = sc.nextInt();
		
		
		
		 
		// insertdataUsingMethodParam(id,name,Dept,marks);
		
//		insertdata(56, "jayyi", "ML", 78);
//		insertdata(57, "tomii", "ML", 88);
//		insertdata(58, "dannyy", "ML", 68);
		
	}
}

