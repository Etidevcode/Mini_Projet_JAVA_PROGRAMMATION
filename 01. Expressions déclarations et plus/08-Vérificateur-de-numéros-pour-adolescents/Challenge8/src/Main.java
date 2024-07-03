public class Main {
	public static void main(String[] args) {

		/*System.out.println(hasTeen(9, 99, 19));  // Output: true
		System.out.println(hasTeen(23, 15, 42)); // Output: true
		System.out.println(hasTeen(22, 23, 34)); // Output: false
		System.out.println(isTeen(9));           // Output: false
		System.out.println(isTeen(13));          // Output: true*/

		boolean result1 = TeenNumberChecker.hasTeen(9, 99, 19);
		System.out.println(result1);

		boolean result2 = TeenNumberChecker.hasTeen(23, 15, 42);
		System.out.println(result2);

		boolean result3 = TeenNumberChecker.hasTeen(22, 23, 34);
		System.out.println(result3);

		boolean result4 = TeenNumberChecker.isTeen(9);
		System.out.println(result4);


		boolean result5 = TeenNumberChecker.isTeen(13);
		System.out.println(result5);
	}
}