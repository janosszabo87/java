package exerciseSheet5Class;

public class Ex1Car {
	
	//member variables
	
	private String make;
	private String model;
	private double engineSize;
	
	
	
	//Set Constructor
	
	public Ex1Car(){
		
	}
	
	public Ex1Car(String newMake,String newModel,double newEngineSize){
		make= newMake;
		model=newModel;
		engineSize=newEngineSize;
	}
	
	
	// set method
	
	public void setMake(String newMake){
		make= newMake;
	}
	
	public void setModel(String newModel){
		this.model=newModel;
	}
	
	public void setEngineSize(double newEngineSize){
		this.engineSize=newEngineSize;
		
	}
	
	
	
	//Get method
	
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public double getEngineSize(){
		return engineSize;
	}
	
	//String
	
	@Override
	
	public String toString(){
		return "\nMake:"+make+"\nModel:"+model+"\nEngineSize:"+engineSize;
	}
	

}


