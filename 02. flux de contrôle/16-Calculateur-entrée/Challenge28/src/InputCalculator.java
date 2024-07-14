import java.util.Scanner;

public class InputCalculator {

	public static void inputThenPrintSumAndAverage() {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		while (true) {
			boolean isAnt = scanner.hasNextInt();

			if (isAnt) {
				int number = scanner.nextInt();
				sum += number;
				count++;
			} else {
				break;
			}
			scanner.nextLine();
		}
		scanner.close();

		long average = Math.round((double) sum / count);
		System.out.println("SUM  = " + sum + " AVG = " + average);
	}
}
