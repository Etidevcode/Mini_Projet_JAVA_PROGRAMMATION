public class Main {
	public static void main(String[] args) {

		// Devrait retourner vrai
		boolean result1 = BarkingDog.shouldWakeUp(true, 1);
		System.out.println(result1); // Output: True

		// Devrait renvoyer false puisque le chien n'aboie pas
		boolean result2 = BarkingDog.shouldWakeUp(false, 2);
		System.out.println(result2); // Output: False

		// Devrait renvoyer false puisque ce n'est pas avant 8
		boolean result3 = BarkingDog.shouldWakeUp(true, 8);
		System.out.println(result3); // Output: False

		// Devrait renvoyer false puisque le paramètre hourOfDay doit être compris entre 0 et 23
		boolean result4 = BarkingDog.shouldWakeUp(true, -1);
		System.out.println(result4); // Output: False
	}
}