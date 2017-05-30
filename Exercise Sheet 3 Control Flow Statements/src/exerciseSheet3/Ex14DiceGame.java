package exerciseSheet3;

public class Ex14DiceGame {

	public static void main(String[] args) {

		int dice1= (int)(Math.random()*6) + 1;
		System.out.println(dice1);
		
		int dice2 = (int)(Math.random()*6)+1;
		System.out.println(dice2);
		
		Ex14DiceGame dg= new Ex14DiceGame();
		
		int yourScore= dg.diceThrow(dice1, dice2);
			System.out.println("Your points:"+ yourScore);
		}
	
	private int diceThrow(int dice1, int dice2){
		int score=dice1*dice2;
		
		if(dice1==6 || dice2==6)
			score = dice1+dice2;
		
		
		if(dice1==3 || dice2==3)
			score= score+10;
		
		if(dice1== 5 || dice2 ==5)
			score= score-4;
		
		return score;
		
		
		
		
	}
	

}
