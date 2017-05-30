import java.util.Scanner;
public class Ex10Floats{

	public static void main(String[]args){
		Ex10Floats ex10=new Ex10Floats();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a flow number:");
		float a=input.nextFloat();
		System.out.println("Enter a flow number:");
		float b=input.nextFloat();
		System.out.println("Enter a flow number:");
		float c=input.nextFloat();
		
		ex10.numbers(a,b,c);
		
		
		
	
	
	}
		public void numbers(float a,float b,float c){
			if (a==b && a==c)
				System.out.println("All numbers are the same!");
		else if (a==b || b==c )
				System.out.println("Two numbers are the same!");
			else
				System.out.println("All numbers are different");
		
		
		}
}