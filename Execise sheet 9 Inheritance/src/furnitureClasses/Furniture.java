package furnitureClasses;

public class Furniture {

	// member variables

	private Colour colour;
	private Material materialType;

	// Constructor
	public Furniture() {
		colour=Colour.BLACK;
		materialType=Material.WOOD;
		
				
	}
	
	public Furniture(Colour colour,Material material){
		this();
		setColour(colour);
		setMaterialType(material);
		
	}

	// Getters and setters
	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

	public void setMaterialType(Material material) {
		materialType=material;
	}

	public Material getMaterialType() {
		return this.materialType;
	}

	//toString()
	
	public String toString(){
		return "Colour: "+ colour +
				"\nMaterial: " + materialType;
	}
}
