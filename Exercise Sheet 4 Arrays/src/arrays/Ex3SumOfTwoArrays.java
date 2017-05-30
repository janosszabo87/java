package arrays;

public class Ex3SumOfTwoArrays {

	public static void main(String[] args) {
		Ex3SumOfTwoArrays ex = new Ex3SumOfTwoArrays();

		int[] nums1 = new int[8];
		int[] nums2 = new int[8];

		ex.addTwoarray(nums1, nums2);

	}

	public void addTwoarray(int nums1[], int nums2[]) {

		for (int i = 0; i < 1; i++) {
			System.out.printf("%-12s%-12s%s\n", "Array1", "Array2", "Sum");

		}

		for (int i = 0, value1 = 1, value2 = 5; i < nums1.length; i += 1, value1 += 1, value2 += 5) {

			nums1[i] = value1;
			nums2[i] = value2;

			double total = nums1[i] + nums2[i];

			System.out.printf("%-12d%-12d%.2f\n", value1, value2, total);

		}
	}
}
