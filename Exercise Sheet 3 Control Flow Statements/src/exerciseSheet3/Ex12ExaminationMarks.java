package exerciseSheet3;

import java.util.Scanner;
public class Ex12ExaminationMarks {

	public static void main(String[] args) {
		Ex12ExaminationMarks em= new Ex12ExaminationMarks();
		
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Enter student number:");
		int studentNumber = inputs.nextInt();
		
		
		
		System.out.println("Enter Exam result 1:");
		double result1 = inputs.nextFloat();
		
		
		
		System.out.println("Enter exam result 2:");
		double result2 = inputs.nextFloat();
		
		System.out.println("Enter exam result 3:");
		double result3 = inputs.nextFloat();
		
		em.passOrFail(studentNumber,result1,result2,result3);
		
		inputs.close();
		
	}
	
	public void passOrFail(int studentNumber, double result1, double result2, double result3){
		double average=(result1+result2+result3)/3;
		if(result1>=40 && result2>=40 && result3>=40)
			System.out.println(studentNumber+": Passed");
		else if(average >=50 && result1<=40)
			System.out.println(studentNumber+": Passed");
		else if(average >=50 && result2<=40)
			System.out.println(studentNumber+": Passed");
		else if(average >=50 && result3<=40)
			System.out.println(studentNumber+": Passed");
		else
			System.out.println(studentNumber+": Failed");
		
		
	}

}
