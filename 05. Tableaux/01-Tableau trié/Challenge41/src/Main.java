public class Main {
	public static void main(String[] args) {

		int[] myIntegers = SortedArray.getIntegers(5);
		int[] sortedArray = SortedArray.sortIntegers(myIntegers);
		SortedArray.printArray(sortedArray);
	}
}