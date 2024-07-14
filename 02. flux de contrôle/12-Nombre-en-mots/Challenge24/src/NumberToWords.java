public class NumberToWords {

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
			return;
		}

		int reversedNumber = reverse(number);
		int countDifference = getDigitCount(number) - getDigitCount(reversedNumber);

		while (reversedNumber > 0) {
			int digit = reversedNumber % 10;
			reversedNumber /= 10;

			String word = switch (digit) {
				case 0 -> "Zero";
				case 1 -> "One";
				case 2 -> "Two";
				case 3 -> "Three";
				case 4 -> "Four";
				case 5 -> "Five";
				case 6 -> "Six";
				case 7 -> "Seven";
				case 8 -> "Eight";
				case 9 -> "Nine";
				default -> throw new IllegalStateException("Unexpected value: " + digit);
			};
			System.out.print(word + " ");
		}

		for (int i = 0; i < countDifference; i++) {
			System.out.print("Zero ");
		}
		System.out.println();
	}

	public static int reverse(int number) {
		int reversedNumber = 0;
		boolean isNegative = number < 0;
		if (isNegative) {
			number = -number;
		}
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		return isNegative ? -reversedNumber : reversedNumber;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

}
