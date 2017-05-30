package exerciseSheet5Class;

public class Ex3Membership {
	// member variables:

	private String memberName;
	private double cost;
	private String paymentType;

	public static int membershipNumber=1000;
	// Constructors

	public Ex3Membership() {
		membershipNumber++;

	}

	public Ex3Membership(String fullname, String paymentType) {
		this();
		setMemberName(fullname);
		setPaymentType(paymentType);

	}

	// Set Methods

	public void setMemberName(String name) {
		
		if (name.length() > 5 && name.length()<50) {
			this.memberName = name;
		}
		else System.out.println("Name can't contain more than 50 character and has to contain at least 5 chararcters");
		}

	public void setPaymentType(String paymentType) {
		switch (paymentType) {
		case "monthly":
			cost = 39.99;
			break;
		case "yearly":
			cost = 249.99;
			break;
		default:
			paymentType = null;
			System.out.println("Payment type must be set to 'monthly' or 'yearly'");
			break;
		}
		this.paymentType = paymentType;

	}

	// Get Methods

	public String getMemberName() {
		return memberName;
	}

	public double getMemberShipCost() {

		return cost;

	}

	public String getPaymentType() {
		return paymentType;
	}

	// toString Method

	public String toString() {
		return "\nID: " +membershipNumber+ "\nMember's name: " + memberName + "\nPayment Type: " + paymentType
				+ "\nMembership Cost: " + cost;
	}
}
