package arrays;

public class Ex7PrintSmallestandLargest {

	public static void main(String[] args) {
		int[] array1 = new int[10];

		for (int i = 0, value = 1; i < array1.length; i++, value += 23) {

			array1[i] = value;
		}

	}

	public void SmallestOrLargest(int[] array) {
		int smallest = array[0];
		int largest = array[0];

		for (int i : array) {
			if (i < smallest)
				smallest = i;
			else if (i > largest)
				largest = i;
		}

	}

}
