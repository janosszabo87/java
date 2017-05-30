package arrays;

public class Ex4ArrayOfPrices {

	public static void main(String[] args) {
		double[] array1 = { 1.23, 45, 23.89, 89.1, 65.4, 78.2, 9, 6, 3, 2, 1, 4 };
		double[] array2 = new double[array1.length];

		for (int j = 0; j < 1; j++) {
			System.out.printf("%-12s%-12s\n", "Price1", "Price2");
		}

		for (int i = 0; i < array1.length; i++) {

			array2[i] = array1[i] * 1.04;

			System.out.printf("%-12s%-12s\n", " ", " ");
			System.out.printf("%-12.2f%-12.2f", array1[i], array2[i]);

		}

	}

}
