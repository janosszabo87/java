package ExerciseSheet5Main;

import exerciseSheet5Class.Ex2Dog;

public class Ex2DogMain {
	public static void main (String[]args){
		
		Ex2Dog d1= new Ex2Dog();
		
		d1.setBreed("vizsla");
		d1.setColour("white");
		d1.setOwnerName("John Grey");
		
		
		
		
		//System.out.printf("%-15$s%-15$s%s", "Breed", "Color", "Owner");
		System.out.printf("Breed: %s \nColour: %s \nOwner: %s \nID: %d",d1.getBreed(),d1.getColour(),d1.getOwnerName(),d1.getID());
		
		
		
		System.out.println("\n");
		
		Ex2Dog d2= new Ex2Dog("German Shepherd","black and brown","Chris Brown");
		System.out.println(d2);
		
		System.out.println("\n"+ "This is the state of the counter: "+Ex2Dog.dogId);
		
		Ex2Dog d3=new Ex2Dog("Pomerian","black","John Snow");
		System.out.printf("\nBreed: %s\nColour: %s\nOwner's name: %s \nID: %d",d3.getBreed(),d3.getColour(),d3.getOwnerName(),d3.getID());
	
		
		
	}
	
}
