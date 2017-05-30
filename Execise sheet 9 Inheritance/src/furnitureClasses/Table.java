package furnitureClasses;

public class Table extends Furniture{
	
	//member variables
	private Expandable expandable;
	private Shape shape;
	
	//Constructor
	
	public Table(){
		expandable=Expandable.NO;
		shape=Shape.SQARE;
	}
	
	
		
	
	
	//accessors
	
	public Table(Colour colour, Material material,Expandable expandable,Shape shape) {
		//this();
		super(colour, material);
				// or
		//super.setColour(colour);
		//super.setMaterialType(material);
		
		setIsExpandable(expandable);
		setShape(shape);
		
		
		
	}





	public void setIsExpandable(Expandable expandable){
		this.expandable=expandable;
	}
	
	public Expandable getIsExpandable(){
		return expandable;
	}
	
	public void setShape(Shape shape){
		this.shape=shape;
	}
	
	public Shape getShape(){
		return this.shape;
	}
	
	//toString()
	
	public String toString(){
		return super.toString()+
				"\nExpandable: "+expandable+
				"\nShape: "+shape; 
	}
	
	
	
	
	
	
	

}
