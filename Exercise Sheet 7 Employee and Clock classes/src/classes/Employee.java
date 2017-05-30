package classes;

public class Employee {
	
		//member variables
		
		private String name;
		private int age;
		private double salary;
		private int noSicksDays;
		
		//static variables
		private static int employeeNumber;
		
		//Constructors
		
		public Employee(){
			employeeNumber=1000;
			employeeNumber+=1;
			name="Employee name not set";
			//age=Integer.parseInt("Age not set");
			//salary= Double.parseDouble("Salary is not set");
			//noSicksDays = Integer.parseInt("Number of sick days are not set");
			
			
		}
		
		public Employee(String EmployeeName){
			this();
			setName(EmployeeName);
		}
		
		public Employee(String EmployeeName,int EmployeeAge,double PerHourSalary,int noSickDays){
			this();
			
			setName(EmployeeName);
			setAge(EmployeeAge);
			setSalary(PerHourSalary);
			setNoSickDays(noSickDays);
		}
		
	
		
		
		//set and get methods or accessors
		
		public void setName(String name){
			if(name.length()>2 && name.length()<50){
				this.name=name;
		}else 
			System.out.println("Name must contain at least 2 characters and a maximum of 50 charactaers.");
			
		}
		
		public String getName(){
			return name;
		}
		
		public void setAge(int age){
			if(age>18 && age<150){
				this.age=age;				
			}else
				System.out.println("Invalid Age");
			
		}
		
		public int getAge(){
			return age;
		}
		
		public void setSalary(double salaryPerHour){
			if(salaryPerHour>=9.15){
				this.salary=salaryPerHour*39*52;
			}
			else System.out.println("\nThe minimum wage is 9.15. Insert a legal value.\n");
			
			
				
		}
		
		public double getSalary(){
			return salary;
		}
		
		
		
		public void setNoSickDays(int noSickDays){
			if(noSickDays>=0 && noSickDays<=366){
				this.noSicksDays=noSickDays;
			}
			
			
			if(noSickDays<10){
				System.out.println("Exellent performance");
			}
			else if(noSickDays<20){
				System.out.println("Average performance");
			}
			else if(noSickDays<30){
				System.out.println("Poor performance");
			}
			else System.out.println("Very Poor");
			
		}
		
		public int getNoSickDays(){
			return noSicksDays;
		}
		
		public void increaseSalary(double salaryIncrease){
			this.salary=this.salary+salaryIncrease;
		}
		
		//toString()
		
		public String toString(){
			
//			String text = "emp name" + name; 
//			if (age == 0)
//				text += "age not set";
//			else 
//				text += "age is " + age;
//			text += "salary " + salary;
//			
//			return text;
			
			return String.format(
					"Employee name: %s"
					// ( condition ? true part    : false part              )
					+ (age == 0 ? "\nAge: not set" : "\nEmployee age: " + age)
					+ (salary==0 ? "\nSalary: not set" : "\nSalary: "+getSalary())
					+ (noSicksDays==0 ? "\nNumber of sick days: not set" : "\nNumber of Sick days: "+noSicksDays),
					name);
		}
}
