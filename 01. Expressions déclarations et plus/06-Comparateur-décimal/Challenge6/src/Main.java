public class Main {
	public static void main(String[] args) {

		boolean result1 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		System.out.println(result1);  // Output: true
		boolean result2 = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
		System.out.println(result2);    // Output: false
		boolean result3 = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
		System.out.println(result3);        // Output: true
		boolean result4 = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
		System.out.println(result4);   // Output: false
	}
}