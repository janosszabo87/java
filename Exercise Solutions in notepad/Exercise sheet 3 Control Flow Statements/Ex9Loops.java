import java.util.Scanner;
public class Ex9Loops{

	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a value:");
		int inputValue=input.nextInt();
		
	
		if (inputValue>0 && inputValue<11)
			System.out.println("Your number is between 0-10");
		else if(inputValue>10 && inputValue<21)
			System.out.println("Your number is between 10-20");
		else if(inputValue>20 && inputValue<31)
			System.out.println("Your number is between 21-30");
		else if(inputValue>30 && inputValue<41)
			System.out.println("Your number is between 31-40");
		else if(inputValue>40 && inputValue<51)
			System.out.println("Your number is between 41-50");
		else if(inputValue>50 && inputValue<61)
			System.out.println("Your number is between 51-60");
		else if(inputValue>60)
			System.out.println("Your number is greater than 60");
		else(inputValue<0)
			System.out.println("Your number is less than 0");
	}

}