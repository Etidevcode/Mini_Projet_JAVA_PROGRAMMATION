public class Main {
	public static void main(String[] args) {

		System.out.println("Retourne l' inverse numérique");
		System.out.println(NumberToWords.reverse(123));
		System.out.println(NumberToWords.reverse(1010));
		System.out.println(NumberToWords.reverse(1000));
		System.out.println(NumberToWords.reverse(-12));

		System.out.println("Compte le nombre de chiffres dans un nombre");

		System.out.println(NumberToWords.getDigitCount(123));
		System.out.println(NumberToWords.getDigitCount(1010));
		System.out.println(NumberToWords.getDigitCount(1000));
		System.out.println(NumberToWords.getDigitCount(-12));

		System.out.println("Conversion des chiffres en mots");

		NumberToWords.numberToWords(123); // Output: One Two Three
		NumberToWords.numberToWords(1010); // Output: One Zero One Zero
		NumberToWords.numberToWords(1000); // Output: One Zero Zero Zero
		NumberToWords.numberToWords(-12); // Output: Invalid Value


	}
}