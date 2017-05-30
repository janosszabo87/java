package arrays;

import java.util.Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {
		String[] firstName = { "Janos", "Ben", "Shaun", "Kevin", "Stephen", "Assan", };
		String[] lastNames = { "T.", "J.", "G.", "McN.", "Unknown", "D." };

		for (int i = 0; i < 1; i++) {
			System.out.printf("%-15s%-15s%-15s\n", "First Names", "Last Names", "Full Names");
		}

		for (int i = 0; i < firstName.length; i++) {
			String fullName = firstName[i] + " " + lastNames[i];
			System.out.printf("%-15s%-15s%-15s\n", firstName[i], lastNames[i], fullName);

		}

		String[] names = new String[firstName.length];

		for (int i = 0; i < firstName.length; i++) {
			names[i] = firstName[i] + " " + lastNames[i];

		}

		for (String newname : names) {
			System.out.println(newname);
		}

		Arrays.sort(names);

	}

}
