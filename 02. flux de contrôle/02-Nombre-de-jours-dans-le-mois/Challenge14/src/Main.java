public class Main {
	public static void main(String[] args) {

		// Testing isLeapYear method
		System.out.println("Testing isLeapYear method:");
		System.out.println("isLeapYear(-1600): " + NumberOfDaysInMonth.isLeapYear(-1600)); // false
		System.out.println("isLeapYear(1600): " + NumberOfDaysInMonth.isLeapYear(1600));   // true
		System.out.println("isLeapYear(2017): " + NumberOfDaysInMonth.isLeapYear(2017));   // false
		System.out.println("isLeapYear(2000): " + NumberOfDaysInMonth.isLeapYear(2000));   // true

		// Testing getDaysInMonth method
		System.out.println("\nTesting getDaysInMonth method:");
		System.out.println("getDaysInMonth(1, 2020): " + NumberOfDaysInMonth.getDaysInMonth(1, 2020));   // 31
		System.out.println("getDaysInMonth(2, 2020): " + NumberOfDaysInMonth.getDaysInMonth(2, 2020));   // 29
		System.out.println("getDaysInMonth(2, 2018): " + NumberOfDaysInMonth.getDaysInMonth(2, 2018));   // 28
		System.out.println("getDaysInMonth(-1, 2020): " + NumberOfDaysInMonth.getDaysInMonth(-1, 2020)); // -1
		System.out.println("getDaysInMonth(1, -2020): " + NumberOfDaysInMonth.getDaysInMonth(1, -2020)); // -1
	}
}