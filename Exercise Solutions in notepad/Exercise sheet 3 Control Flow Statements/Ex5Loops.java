import java.util.Scanner;
public class Ex5Loops{
	public static void main(String[]args){
		Ex5Loops ex5= new Ex5Loops();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter width:");
		double width= input.nextDouble();
		
		System.out.print("Enter breadth:");
		double breadth= input.nextDouble();
		
		
		
		ex5.calculateAreaAndPerimeter(width,breadth);
		
	
	
	
	}
	
	public void calculateAreaAndPerimeter(double a,double b){
		double area= a*b;
		double perimeter= (a+b)*2;
		if (a==b)
			System.out.printf("The area and perimeter of the square are:%.2fcm2 and %.2fcm",area,perimeter);
	
		else
			System.out.printf("The area and perimeter of the rectangle are:%.2fcm2 and %.2fcm",area,perimeter);
	
	}

}