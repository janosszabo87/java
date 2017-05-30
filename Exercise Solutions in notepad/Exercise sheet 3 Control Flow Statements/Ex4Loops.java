public class Ex4Loops{

	public static void main(String[]args){
	
		int numOfLives = 8;
		while(numOfLives>=0){
			System.out.println("\n"+numOfLives+" Lifes are remaining");
			numOfLives+=-1;
		}
		
		int a=8;
		do{
		System.out.print(a+" "+"Lifes remaining\t");
		a=a+-1;
		}while(a>=0);
		
		for(int c=8; c>=0; c+=-1){
			System.out.println(c+" "+"Life remaining:\n");
		}
		
	
	}
}