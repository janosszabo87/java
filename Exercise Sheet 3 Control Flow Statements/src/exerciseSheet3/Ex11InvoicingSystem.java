package exerciseSheet3;
import java.util.Scanner;


public class Ex11InvoicingSystem {

	public static void main(String[] args) {
		Ex11InvoicingSystem iv = new Ex11InvoicingSystem();
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter Reference number:");
		int reference=inputs.nextInt();
		System.out.println("Enter price:");
		double price= inputs.nextFloat();
		System.out.println("Enter Quantity:");
		int quantity=inputs.nextInt();

		iv.totalcost(price,quantity,reference);


		inputs.close();

	}

	public void totalcost(double price, double quantity,int reference){


		double fullPrice=0;
		double discountPrice= (quantity-100)*(price*0.75);
		double unitPrice = 100*price;

		if(quantity<=100 && quantity >0)
			fullPrice=price*quantity;
		else if(quantity>100)
			fullPrice=unitPrice+discountPrice;
		System.out.printf("Reference number: %d\nTotal cost:%.2f",reference,fullPrice);



	}

}

