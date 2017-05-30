package exerciseSheet5Class;



public class Ex4EmailAccount {

	//member variable
	public static int id;
	private String emailAddress;
	private String password;
	private int storage;
	private String accountType;
	private String paymentType;
	private double monthlyCost;
	private double yearlyCost;
	
	
	//constructor
	
	public Ex4EmailAccount(){
		id=1000;
		id+=1;
	}
	
	public Ex4EmailAccount(String email,String password,String accountType,String paymentType){
		this();
		setEmail(email);
		setPassword(password);
		setAccountType(accountType);
		setPaymentType(paymentType);
		
	}
	
	
	
	//set method
	
	public void setEmail(String email){
		emailAddress=email;
	}
	
	public void setPassword(String password){
		if (password.length()==8){
		this.password=password;
		}
		else System.out.println("Password must be 8 character long");
	}
	
	
	public void setAccountType(String accountType){
		this.accountType=accountType;
		switch (accountType) {
		case "basic":
			storage=10;
			monthlyCost=0;
			break;
		case "silver":
			storage=25;
			monthlyCost=10;
		case "gold":
			storage=100;
			monthlyCost=25;
		default:
			accountType=null;
			System.out.println("Account type must be 'basic', 'silver' or 'gold' ");
			break;
		}
	}
	
	public void setPaymentType(String paymentType){
		switch (paymentType) {
		case "monthly":
			yearlyCost=monthlyCost*12;
			break;
		case "yearly":
			yearlyCost= (monthlyCost*12)*0.90; 

		default:
			paymentType="monthly";
			break;
		}
	}
	
	//get method
	
	public String getEmail(){
		return this.emailAddress;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public int getStorage(){
		return this.storage;
	}
	
	public String getAccountType(){
		return accountType;
	}
	
	public String getPaymentType(){
		return this.paymentType;
	}
	
	public double getYearlyCost(){
		return yearlyCost;
	}
	
	public double getMonthlyCost(){
		return monthlyCost;
	}
	
	
	
	//toString method
	
	public String toString(){
		return String.format("Email: %s\npassword: %s\nstorage: %dGb\nID:%d",emailAddress, password,storage,id);
		}
	
	
}
