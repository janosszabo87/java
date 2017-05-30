public class VariablesAndOperators{

	public static void main (String [] args){
			
		int num1 = 25;
		double num2 = 3.6;
		double num3 = 12.99;
		int num4 = 42;
		double sum = num1+num2+num3+num4;
		double product= num1+num2+num3+num4;
		
		System.out.println(sum+"\n"+product);
		
		int salary = 30000;
		int monthlySalary = salary/12;
		int weeklySalary = salary/52;
		int FiveYears = salary*5;
		double raisedSalary = salary*1.08;
		
		System.out.println("Your Salary:"+ salary +"\n" + "Your monthly Salary" + monthlySalary + "\n" + "Your Weekly Salary:" + weeklySalary + "\n" + "Your salary in five years:" + FiveYears + "\n" + "Your salalary after raise:" + raisedSalary);
		
		double num5 = 1.25;
		double num6 = 2.65;
		double num7 = 22.65;
		double total = num5+num6+num7;
		double average = total/3;
		
		System.out.printf("\t" + "The Sum of the numbers:" + total + "\n" + "\t" + "The average of the numbers:" + average);
	
	}

}