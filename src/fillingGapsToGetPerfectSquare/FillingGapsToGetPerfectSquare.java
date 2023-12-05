package fillingGapsToGetPerfectSquare;

public class FillingGapsToGetPerfectSquare {

	public static void main(String[] args) {
		String numberString = "15_2_"; // Replace this with your desired number pattern
		findPerfectSquareFill(numberString);
	}

	public static void findPerfectSquareFill(String numberString) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				String filledNumber = numberString.replaceFirst("_", Integer.toString(i));
				filledNumber = filledNumber.replaceFirst("_", Integer.toString(j));

				int filledInt = Integer.parseInt(filledNumber);

				if (isPerfectSquare(filledInt)) {
					System.out.println("The filled number is: " + filledInt);
					return;
				}
			}
		}

		System.out.println("No combination found to make a perfect square.");
	}

	public static boolean isPerfectSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num;
	}
}
