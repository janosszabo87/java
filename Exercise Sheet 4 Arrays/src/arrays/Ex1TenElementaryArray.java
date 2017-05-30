package arrays;


public class Ex1TenElementaryArray {
	
	public static void main(String[]args){
		
		int[] nums= new int[10];
		
		
		
		for (int i=0, value=0;  i < nums.length; i++, value= value+2){
			
			nums[i]= value;
		}
		
		for(int i=0; i<nums.length; i++){
			System.out.print(nums[i]+" ");
		}
		
		
		
		
		
		
		
		
		
			
			
		
	}
}


