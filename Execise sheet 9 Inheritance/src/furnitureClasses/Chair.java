package furnitureClasses;

public class Chair extends Furniture {
	//member variable
	
	private HasGaslift hasGasLift;
	private ChairType type;
	
	//Constructors
	
	public Chair(){
		
	}
	
	public Chair(Colour colour,Material material,HasGaslift hasGasLift,ChairType type){
		super(colour, material);
		setGaslift(hasGasLift);
		setType(type);
		
	}
	
	
	//setters and getters
	
	public void setGaslift(HasGaslift hasGaslift){
		this.hasGasLift=hasGaslift;
		
	}
	
	public HasGaslift getGaslift(){
		return this.hasGasLift;
		
	}	
	
	public void setType(ChairType type){
		this.type=type;
		
		
	}
	
	public ChairType getType(){
		return type;
	}
	
	public String toString(){
		return 	"Colour: "+getColour()+
				"\nMaterial:" +getMaterialType()+
				"\nHas Gaslift: "+getGaslift()+
				"\nType:"+getType();
	}
}
