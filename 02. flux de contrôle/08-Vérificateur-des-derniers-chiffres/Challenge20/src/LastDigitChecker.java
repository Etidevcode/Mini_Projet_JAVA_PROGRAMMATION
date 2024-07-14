public class LastDigitChecker {

	public static boolean hasSameLastDigit (int num1, int num2, int num3){
		if (!isValid(num1) || !isValid(num2) || !isValid(num3)){
			return false;
		}

		int lastDigitNum1 = num1 % 10;
		int lastDigitNum2 = num2 % 10;
		int lastDigitNum3 = num3 % 10;

		return (lastDigitNum1 == lastDigitNum2) || (lastDigitNum1 == lastDigitNum3) || (lastDigitNum2 == lastDigitNum3);
	}

	public static boolean isValid(int number) {
		return (number >= 10 && number <= 1000);
	}
}
