package com.src1;

public class EmployeeMain {

	public static void main(String[] args) {
	        
	        Employee s1=new Employee();
	        Employee.incemp();
	        s1.empid=46;
	        s1.empname="vish";
	        s1.empaddr="Theni";
	        s1.empdept="EEE";
	        s1.salary=50000;
	        
	        System.out.println(s1.id());
	        s1.salary(50000);
	        
	       System.out.println("the average employees are "+s1.averageemployees(1000));
	        
	        
	        s1.display();
	        
	        Employee s3=new Employee(6,"narain","Theni","it",30000); 
	        Employee.incemp();
	       System.out.println(s3.averageemployees(1000));
	        
	        
	        s3.display();
	        
	       
	        
	        
	        

	}

}
