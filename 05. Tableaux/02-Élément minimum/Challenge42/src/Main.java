public class Main {
	public static void main(String[] args) {

		int count = MinimumElement.readInteger();
		int[] array = MinimumElement.readElements(count);
		int minValue = MinimumElement.findMin(array);
		System.out.println("Minimum value in the array is: " + minValue);
	}
}