import java.util.Scanner;
public class Ex8Loops{
	public static void main(String[]args){
	
			Scanner input =new Scanner(System.in);
			int value=0;
			int total=0;
			int counter=0;
			
			do{
			System.out.println("Enter an integer: ");
			value=input.nextInt();
			
			if(value!=-1){
			total=total+value;
			counter=counter+1;
			
			
			
			}
			
			
			
			}
			while(value!=-1);
			
			int average=total/counter;
			System.out.println("Total:"+total);	
			System.out.println("Average:"+average);
			
			
			
	}
}