import java.util.Scanner;
public class Ex7Loops{
		
		public static void main(String[]args){

			Scanner input =new Scanner(System.in);
			int i=0;
			
			int total=0;
			
			
		
			do{
			System.out.println("Enter an integer: ");
			int a=input.nextInt();
			
			total=total+a;
			
			i+=1;
			
			
			}
			while(i<10);
			
			int average=total/i;
			System.out.println("Total:"+total);	
			System.out.println("Average:"+average);
			
			
			
		}
		
		
	}
		
		
		
		

