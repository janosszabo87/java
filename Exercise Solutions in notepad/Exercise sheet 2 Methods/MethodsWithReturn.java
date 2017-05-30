public class MethodsWithReturn{

	public static void main(String[]args){
		MethodsWithReturn m2 = new MethodsWithReturn();
			
		double a = 1.2;
		double b = 7.3;
		int c = 8;
		
		//return for exercise 6
		double result= m2.getAverage(a,b,c);
		System.out.printf("The average of %f %f and %d is: %f\n",a,b,c,result);
		
		double total=m2.getTotal(a,b,c);
		System.out.println("This is the total:"+total);
		
		//Exercise 7
		double depth = 25.3;
		double width = 94.8;
		double breadth = 89.1;
		
		double area= m2.getArea(depth,width,breadth);
		System.out.printf("This is the area of the cube: %.4f,\n",area);
		
		//Exercise 8
		int salary = 30000;
		
		double monthlySalary= m2.getMonthlySalary(salary);
		System.out.println("This is your monthly salary:"+ monthlySalary);
		
		int weeklySalary = m2.getWeeklySalary(salary);
		System.out.println("This is your weekly salary:"+ weeklySalary);
		
		double fourpercent =m2.getSalaryRaise1(salary);
		System.out.printf("This is your salary after 4%% raise: %.0f\n",fourpercent);
		
		double sixPercent=m2.getSalaryRaise2(fourpercent);
		System.out.println("This is your salaray in the second year:"+sixPercent);
		
		
		//Exercise 9
		
		double celsius = 100;
		double fahrenheit = -56;
		
		double cels=m2.getCelcius(fahrenheit);
		System.out.println(fahrenheit+"fahreheit in celsius is:"+cels);
		
		double fah=m2.getFahrenheit(celsius);
		System.out.printf("%.0f in celsius is %.0f in fahrenheit",celsius,fah);
		
		
		
		//Exercise 10
	
	}
		//method for ex6
	private double getAverage(double x, double y, int z){
			double average = (x+y+z)/3;
			return average; 
	
	}
	
	private double getTotal( double x,double y, double z){
			double total = x+y+z;
			return total;
	
	}
		//Exercise 7
	private double getArea(double a,double b,double c){
			double area = a*b*c;
			return area;
			
	}
		//Exercise 8
		private double getMonthlySalary(int a){
			double monthlySalary = a/12;
			return monthlySalary;
		
		}
		
		public int getWeeklySalary(int a){
			int weeklySalary = a/52;
			return weeklySalary;
		}
		
		public double getSalaryRaise1(int a){
			double fourpercent= a*1.04;
			return fourpercent;
		}
		
		public double getSalaryRaise2(double sixPercent){
			return sixPercent*1.06;
		
		}
		
		//Exercise 9
		public double getCelcius(double a){
			double cels=(a-32)*5/9;
			return cels;
		}
		
		private double getFahrenheit(double a){
			double fah=a*1.8+32;
			return fah;
		}
		
			
}