public class Main {
	public static void main(String[] args) {

		boolean result1 = LeapYear.isLeapYear(-1600);
		System.out.println(result1);

		boolean result2 = LeapYear.isLeapYear(1600);
		System.out.println(result2);

		boolean result3 = LeapYear.isLeapYear(2017);
		System.out.println(result3);

		boolean result4 = LeapYear.isLeapYear(2000);
		System.out.println(result4);

		boolean result5 = LeapYear.isLeapYear(2024);
		System.out.println(result5);
	}
}