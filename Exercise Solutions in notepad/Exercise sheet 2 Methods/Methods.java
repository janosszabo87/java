public class Methods{

public static void main(String[]args){

		Methods m = new Methods();
		
		m.printAddTwoNumbers(5,10);
		m.printMultiplyTwoNumbers(5,10);
		m.printDivideTwoNumbers(5,10);
		m.calculateTotal(5,10);
		m.getAverage(3.14,5.55,37);
		m.getTotal(3.14,5.55,37);
		m.getVolume(12,59,783);
		m.getMonthlySalary(30000);
		
		
		
		
		
		
		

}

		public void printAddTwoNumbers(int a,int b){
			int result = a+b;
			System.out.println("a+b=" + result);
		
		}
		
		public void printMultiplyTwoNumbers(int a,int b){
			int result = a*b;
			System.out.println("a*b=" + result);
		}
		
		public void printDivideTwoNumbers(double a,double b){
			double result = a/b;
			System.out.printf("%f divided by %f = to %f\n", a,b,result);
		}
		
		
		
		public void calculateTotal(double price, double quantity){
			double total= price*quantity;
			System.out.println("This is the total:"+total);
			
		}
		
		public void getAverage(double a,double b, int c){
					double average = (a+b+c)/3;
					System.out.printf("This is the average:%.2f\n",average);
			
		
		}
		
		public void getTotal(double a, double b, int c){
				double total= a+b+c;
				System.out.printf("This is the total of %f %f %d: %f\n",a,b,c,total);
		}
		
		public void getVolume(int a,int b, int c){
		
				int volume = a*b*c;
				System.out.printf("This is the volume of a %dcm x %dcm x %dcm cuboid: %dcm\n",a,b,c,volume);
		}
		
		public void getMonthlySalary(int a){
				
				int monthly = a/12;
				int weekly = a/52;
				double raise1 = a*1.04;
				double raise2 = raise1*1.06;
				
				System.out.printf("This is your yearly salary%d\nThis is will be your monthly salary: %d\nThis will be your weekly salary:%d\nThis will be your annual salary if you get 4%% raise: %f\nThis will be your annual salary on the second year if you get a 6%% pay raise:%f",a,monthly,weekly,raise1,raise2); 
		}
}