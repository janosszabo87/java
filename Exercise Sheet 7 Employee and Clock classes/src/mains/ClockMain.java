package mains;

import classes.Clock;

public class ClockMain {

	public static void main(String[] args) {
		Clock c1 = new Clock(11, 30, 0);      
		System.out.println(c1);         // 11:30:00      
		c1.addHours(3);      
		System.out.println(c1);       	// 14:30:00      
		c1.addMinutes(50); 
		System.out.println(c1);       	// 15:20:00      
		c1.addSeconds(50); 
		System.out.println(c1);      	// 15:20:50 
		c1.addSeconds(15); 
		System.out.println(c1);       	// 15:21:05 
		
		
		

	}

}
