package furnitureClasses;

public class FurnitureMain {

	public static void main(String[] args) {
		
		Table t1=new Table(Colour.BROWN,Material.PLASTIC,Expandable.YES,Shape.HEART) {
		};
		
		System.out.println(t1);
		
		System.out.println("");
		
		Bed b1= new Bed(Colour.BLACK,Material.STEEL,BedHasHadboard.YES,BedSize.SUPER_KING);
		System.out.println(b1);
		
		Chair c1=new Chair();
		c1.setColour(Colour.WHITE);
		c1.setMaterialType(Material.STEEL);
		c1.setGaslift(HasGaslift.NO);
		
		System.out.println("");
		
		System.out.println(c1);
	}

}
