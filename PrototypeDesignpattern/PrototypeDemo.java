package PrototypeDesignpattern;

public class PrototypeDemo {
	public static void main(String[] args)
	{
		   EmployeeRecord e1=new EmployeeRecord(1,"Anjum","SDE",50000.0,"Hyderabad");  
	          
	        e1.showRecord();  
	        System.out.println("\n");  
	        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
	        e2.showRecord();  
	}
  
}
