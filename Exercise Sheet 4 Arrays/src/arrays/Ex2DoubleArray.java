package arrays;

import java.util.Scanner;

public class Ex2DoubleArray {

	public static void main(String[] args) {

		double[] nums = new double[10];
		Scanner input = new Scanner(System.in);
		int i = 0;
		double total = 0;
		double average = 0;

		for (; i < nums.length; i++) {

			System.out.printf("Enter double %d : ", i + 1);

			nums[i] = input.nextDouble();

			total = total + nums[i];
			average = total / i;

		}

		System.out.printf("Total: %.2f\n1", total);
		System.out.printf("Average: %.2f", average);

		input.close();
	}

}
