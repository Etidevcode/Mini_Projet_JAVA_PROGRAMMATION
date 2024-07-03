public class PositiveNegativeZero {

	public static void checkNumber (int number){

		// 1ère proposition

		/*
		if (number > 0){
			System.out.println("positive");
		} else if (number < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
		*/

		// 2 ème proposition
		System.out.println(
				(number > 0) ? "positive" :
						((number < 0) ? "negative" : "zero")
		);
	}
}
