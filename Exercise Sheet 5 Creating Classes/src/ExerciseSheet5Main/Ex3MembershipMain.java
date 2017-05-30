package ExerciseSheet5Main;

import exerciseSheet5Class.Ex3Membership;

public class Ex3MembershipMain {

	public static void main(String[] args) {
		
		Ex3Membership m1=new Ex3Membership("Janos Szabo","yearly");
		System.out.println(m1);
		
		System.out.println("\n--------------------");
		
		Ex3Membership m2=new Ex3Membership();
		
		m2.setMemberName("Joe Duffy");
		System.out.println("member name:"+ m2.getMemberName());
		
		System.out.println("\n--------------------");
		
		Ex3Membership m3=new Ex3Membership("Gabriel","monthly");
		
		System.out.println(m3);
		
		
		
		

	}

}
