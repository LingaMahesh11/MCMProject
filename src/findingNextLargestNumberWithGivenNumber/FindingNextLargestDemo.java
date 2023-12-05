package findingNextLargestNumberWithGivenNumber;

import java.util.Arrays;

public class FindingNextLargestDemo {
	public static void main(String[] args) {

		int inputNumber = 12345;
		int nextLargestNumber = findNextLargestNumber(inputNumber);

		System.out.println("Input Number: " + inputNumber);
		System.out.println("Next Largest Number with the same digits: " + nextLargestNumber);
	}

	private static int findNextLargestNumber(int num) {
		char[] digits = Integer.toString(num).toCharArray();

		// Find the first digit that is smaller than the digit to its right
		int i;
		for (i = digits.length - 2; i >= 0; i--) {
			if (digits[i] < digits[i + 1]) {
				break;
			}
		}

		// If no such digit is found, the number is the largest possible
		if (i == -1) {
			return num;
		}

		// Find the smallest digit to the right of the above found digit and greater
		// than it
		int j;
		for (j = digits.length - 1; j > i; j--) {
			if (digits[j] > digits[i]) {
				break;
			}
		}

		// Swap the digits at positions i and j
		char temp = digits[i];
		digits[i] = digits[j];
		digits[j] = temp;

		// Sort the digits to the right of i in ascending order
		Arrays.sort(digits, i + 1, digits.length);

		// Convert the character array back to an integer
		return Integer.parseInt(new String(digits));

	}
}
