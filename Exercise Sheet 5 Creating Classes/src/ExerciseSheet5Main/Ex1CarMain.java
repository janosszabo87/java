package ExerciseSheet5Main;

import exerciseSheet5Class.Ex1Car;

public class Ex1CarMain {

	public static void main(String[] args) {
		Ex1Car c1=new Ex1Car("Fiat","Punto",1.2);
		
		System.out.printf("Make:%s\nModel:%s\nEngine Size: %.2f",c1.getMake(),c1.getModel(),c1.getEngineSize());
		
		Ex1Car c2 = new Ex1Car();
 		
		c2.setMake("Fiat");
		c2.setModel("Punto");
		c2.setEngineSize(1.2);
		
		System.out.println("\n");
		
		System.out.println("Make:" + c2.getMake());
		System.out.println("Model:" + c2.getModel());
		System.out.println("Engine size:" + c2.getEngineSize()+"\n");
		
		Ex1Car c3= new Ex1Car("Fiat","Punto",1.2);
		System.out.println(c3);
		
		Ex1Car c4=new Ex1Car();
		
		c4.setMake("Fiat");
		c4.setModel("Panda");
		c4.setEngineSize(1.6);
		
		System.out.println("\nMake:"+c4.getMake()+"\nModel:"+c4.getModel()+"\nEngine Size:"+c4.getEngineSize());
		
		Ex1Car c5=new Ex1Car("Seat","Leon",1.8);
		System.out.print(c5);
		
		
		
		Ex1Car [] allCars={c1,c2,c3,c4};
		
		System.out.println("\n");
		
		printAllCars(allCars);
		
		
		
		
	}
	
	
	public static void printAllCars(Ex1Car [] arrayOfCars){
		
		for(Ex1Car cars:arrayOfCars){
			System.out.println("make: "+cars.getMake()+"\nmodel:"+cars.getModel());
		}
		
		
	}

}
