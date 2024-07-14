import java.util.Scanner;

public class MinimumElement {

	public static int readInteger(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of Elements:");
		return scanner.nextInt();
	}

	public static int[] readElements(int count){
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[count];
		for (int i = 0; i < count; i++){
			System.out.println("Enter element #" + (i + 1) + ":");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static int findMin(int[] array){

		int min = Integer.MAX_VALUE;

		for (int value : array) {
			if (value < min) {
				min = value;
			}
		}
		return min;
	}
}
