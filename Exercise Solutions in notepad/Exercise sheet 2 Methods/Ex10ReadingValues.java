import java.util.Scanner;
public class Ex10ReadingValues{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first number:");
		int num1= input.nextInt();
		System.out.print("Enter your second numbers:");
		int num2= input.nextInt();
		System.out.print("Enter your third numbers:");
		int num3 = input.nextInt();
		
		
		Ex10ReadingValues ex10 = new Ex10ReadingValues();
		ex10.addThreeNumber(num1,num2,num3);
		
		
	}
	
	public void addThreeNumber(int a,int b,int c){
		int result = a+b+c;
		System.out.println("This is the result:"+result);
	}


}