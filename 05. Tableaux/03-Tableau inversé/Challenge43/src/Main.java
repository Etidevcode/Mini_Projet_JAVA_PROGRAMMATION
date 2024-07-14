import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int[] array = {16, 48, 27, -36, 28};
		System.out.println("Array = " + Arrays.toString(array));
		ReverseArray.reverse(array);
		System.out.println("Reversed array = " + Arrays.toString(array));
	}
}