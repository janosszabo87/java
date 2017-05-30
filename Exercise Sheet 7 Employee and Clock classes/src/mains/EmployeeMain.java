package mains;

import classes.Employee;

public class EmployeeMain {

	public static void main(String[]args){
		Employee e1=new Employee("Janos",29,10.00,2);
		
		System.out.println(e1);
		
		Employee e2=new Employee("Joe");
		e2.setAge(56);
		e2.setSalary(20.20);
		
		
		System.out.println("\n"+e2);
		
		Employee e3=new Employee("Jordan",19,9.15,30);
		
		System.out.println("\n"+e3);
		
		Employee [] employee ={e1,e2,e3};
		
		new EmployeeMain().printEmployee(employee);
//		
//		EmployeeMain e=new EmployeeMain();
//		
//		e.printEmployee(employee);
		
		
	}
	
	private void printEmployee(Employee [] employee){
		for(Employee emps:employee){
			System.out.println("\n"+emps+"\n");
		}
	}
}
