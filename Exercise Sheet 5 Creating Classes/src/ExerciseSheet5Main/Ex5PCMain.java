package ExerciseSheet5Main;

import exerciseSheet5Class.Ex5PC;

public class Ex5PCMain {
	
	public static void main (String[]args){
		Ex5PC pc1=new Ex5PC(Ex5PC.RAM_4GB,Ex5PC.HDD_250GB,Ex5PC.WINDOWS,Ex5PC.MONITOR_24);
		System.out.println(pc1);
		
		System.out.println("\n");
		
		Ex5PC pc2=new Ex5PC(Ex5PC.RAM_8_GB,Ex5PC.HDD_500GB,Ex5PC.WINDOWS,Ex5PC.MONITOR_24);
		System.out.println(pc2);
		
		Ex5PC pc3=new Ex5PC ();
		pc3.setRam(1);
		pc3.setHdd(3);
		pc3.setOs(2);
		pc3.setMonitor(1);
		
		System.out.println("\n"+pc3);
		
		Ex5PC pc4=new Ex5PC();
		pc4.setHdd(Ex5PC.HDD_100GB);
		pc4.setMonitor(1);
		pc4.setOs(2);
		pc4.setRam(Ex5PC.RAM_16_GB);
		
		System.out.println("\n"+pc4);
		
		Ex5PC pc5= new Ex5PC(5,5,8,66);
		System.out.println("\n" + pc5);
		
	
		Ex5PC [] allpc={pc1,pc2,pc3,pc4,pc5};
		
		System.out.println("\n");
		printPcOver400(allpc);
		
	}
	
	public static void printPcOver400(Ex5PC [] arrayOfPc){
	
		for(Ex5PC PcOver400:arrayOfPc){
				if(PcOver400.getCost()>400){
				System.out.println(PcOver400+"\n");
			}
			}
		}
	}

