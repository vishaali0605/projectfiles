//Demonstrating about employees with properties and methods
package com.src1;

public class Employee {  
        int empid;
        String empname;
        String empaddr;
        String empdept;
        static int totemployees=5;
        int salary;
              
    public void display()
    {
        System.out.println(empid+"  " + empname+"  "+empaddr+" "+empdept+" "+salary+" "+totemployees);
    }
    
    public static void incemp()
    {
        totemployees++;
    }
    public int id()
    {
        return empid;
    }
    
    public double averageemployees(int sum)
    {
        return sum/totemployees;
    }
    
    public void salary(int salary)
    {
       if(salary<10000)
       {
    	   System.out.println("Staff");
       }
       else if(salary>=10000&&salary<50000)
       {
    	   System.out.println("Senior Staff");
       }
       else
       {
    	   System.out.println("Manager");
       }
       
    }

 

    public Employee(int empid, String empname, String empaddr,String empdept,int salary) {
        
        this.empid =empid;
        this.empname = empname;
        this.empaddr = empaddr;
        this.empdept = empdept;
        this.salary = salary;
       
        
    }

 

    public Employee() {
        
        
    }    

 

}
 



