package exerciseSheet5Class;

public class Ex2Dog {

	//member variable
	
	private String breed;
	private String colour;
	private String ownerName;
	private int id;
	public static int dogId=1000;
	
	
	
	//constructors
	
	public Ex2Dog(){
		id=dogId;
		
		dogId=dogId+1;
		
	}
	
	public Ex2Dog(String breed,String colour,String ownerName){
		this();
		
		setBreed(breed);
		setColour(colour);
		setOwnerName(ownerName);
	}
	
 
	
	//set methods
	
	public void setBreed(String newBreed){
		
		switch(newBreed){
		case "vizsla":
			breed = newBreed;
			break;
		case "Labrador":
			breed = newBreed;
			break;
		case "German Shepherd":
			breed = newBreed;
		case "Irish WolfHound":
			breed = newBreed;
		case "Dachshund":
			breed = newBreed;
			break;
		case "Maltese":
			breed = newBreed;
		default:
			System.out.println("\nInvalid Breed");
			
		
		
		}
	}
	
	public void setColour(String newColour){
		colour=newColour;
	}
	
	public void setOwnerName(String newOwnerName){
		ownerName=newOwnerName;
	}
	
	
	//Get methods
	
	public String getOwnerName(){
		return ownerName;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public String getColour(){
		return colour;
	}
	
	public int getID(){
		return id;
	}
	
	
	//toString method
	
	public String toString(){
		return "Breed: "+ breed+
				"\nColour: "+colour+
				"\nOwner's Name: "+ ownerName+
				"\nId: "+getID();
				
				
	}
}
