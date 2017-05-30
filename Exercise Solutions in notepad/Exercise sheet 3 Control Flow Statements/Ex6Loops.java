import java.util.Scanner;
public class Ex6Loops{

	public static void main(String[]args){
		Ex6Loops ex6= new Ex6Loops();
		
		Scanner input =new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		System.out.print("Enter the second integer: ");
		int b = input.nextInt();
		System.out.print("Enter the third integer: ");
		int c = input.nextInt();
		
		
		int result = ex6.addThreeNumbers(a,b,c);
		System.out.println("This is the total:"+result);
		
	
	}
	
	public int addThreeNumbers(int a,int b,int c){
		int total = a+b+c;
		return total;
	}
}