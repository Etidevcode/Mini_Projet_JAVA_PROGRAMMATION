public class Main {
	public static void main(String[] args) {

		boolean result1 = EqualSumChecker.hasEqualSum(1, 1, 1);
		System.out.println(result1);

		boolean result2 = EqualSumChecker.hasEqualSum(1, 1, 2);
		System.out.println(result2);

		boolean result3 = EqualSumChecker.hasEqualSum(1, -1, 0);
		System.out.println(result3);

		boolean result4 = EqualSumChecker.hasEqualSum(19, 16, 47);
		System.out.println(result4);
	}
}