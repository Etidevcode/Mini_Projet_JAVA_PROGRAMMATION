public class NumberOfDaysInMonth {

	public static boolean isLeapYear(int year) {

		if (year < 1 || year > 9999){
			return false;
		} else {
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}
	}

	public static int getDaysInMonth(int month, int year){

		if (month < 1 || month > 12 || year < 1 || year > 9999){
			return -1;
		} else {

			switch (month){

				case 1, 3, 5, 7, 8, 10, 12 -> {
					return 31;
				} // Months with 31 days
				case 4, 6, 9, 11 -> {
					return 30;
				} // Months with 30 days
				case 2 -> {
					return isLeapYear(year) ? 29 : 28; // February with 28 or 29 days
				}
				default -> {
					return -1; // This line is technically redundant due to the initial check
				}
			}
		}
	}
}
