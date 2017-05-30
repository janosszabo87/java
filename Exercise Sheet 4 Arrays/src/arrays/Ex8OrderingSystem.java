package arrays;

import javax.swing.JOptionPane;

public class Ex8OrderingSystem {

	public static void main(String[] args) {
		int[] refNums = { 1000, 1001, 1002, 1003, 1004 };
		String[] productNames = { "Keyboard", "Mouse", "Monitor", "Mouse Mat", "Speakers", };
		double[] prices = { 49.99, 15.50, 124.99, 3.99, 23.50 };

		System.out.printf("%-20s%-20s%s\n", "Reference Numbers:", "Product Name:", "Price:");
		System.out.printf("%1$-20s%3$-20s%2$s\n", "-------------------", "---------------", "-------");

		for (int i = 0; i < refNums.length; i++) {
			int referenceNumber = refNums[i];
			String product = productNames[i];
			double price = prices[i];

			System.out.printf("%-20d%-20s%.2f\n", referenceNumber, product, price);

		}

		String strProductNames = JOptionPane.showInputDialog("Please input a value");
		int intProductNames = Integer.parseInt(strProductNames);

		boolean isFound = false;
		for (int i = 0; i < refNums.length; i++) {

			if (intProductNames == refNums[i]) {

				isFound = true;

				JOptionPane.showMessageDialog(null, String.format("%s: € %.2f", productNames[i], prices[i]));

				String strQuantity = JOptionPane.showInputDialog("Enter quantity");

				int quantity = Integer.parseInt(strQuantity);

				double total = quantity * prices[i];

				JOptionPane.showMessageDialog(null,
						String.format("The total cost of your order is %d x %.2f = %.2f", quantity, prices[i], total));
				break;
			}
		}

		if (!isFound)
			JOptionPane.showMessageDialog(null, "Product not found");
	}
}
