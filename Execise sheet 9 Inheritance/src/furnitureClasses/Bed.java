package furnitureClasses;

public class Bed extends Furniture {
	//member variables
	
	private BedHasHadboard bedhasHeadboard;
	private BedSize bedsize;
	
	//Constructors
	
	public Bed(){
		
	}
	
	public Bed(Colour colour,Material material,BedHasHadboard hasHeadboard,BedSize size){
		// this();
		super(colour, material);
		setSize(size);
		setHeadboard(hasHeadboard);
	}
	
	
	
	
	//Set and get methods
	
	public void setHeadboard(BedHasHadboard hasHeadboard){
		this.bedhasHeadboard=hasHeadboard;
		
	}
	
	public BedHasHadboard getHeadboard(){
		return this.bedhasHeadboard;
	}
	
	public void setSize(BedSize size){
		this.bedsize=size;
	}
	
	public BedSize getSize(){
		return this.bedsize;
	}
	
	//to String method
	
	public String toString(){
		return "colour: " + getColour()+
				"\nMaterial: " +getMaterialType()+
				"\nHeadboard: "+ getHeadboard()+
				"\nSize: "+getSize();
				}
}

