
public class Methods {

	public static void main(String[] args) {
		int[] n = { 52, 7, 56, 3, 4, 78, 9 };
		sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		int n2[] = {546, 34, 3, 11, 21, 45, 99};
		System.out.println("The max difference is: " +maxDiff(n2));
		
	}

	/*
	 * Challenge 1: Create a method that takes an unsorted array of integers, sorts
	 * it in ascending/increasing order, and returns the sorted array of integers.
	 */
	public static int[] sort(int[] unsortedArray) {
		// Bubble sort
		for (int i = 0; i < unsortedArray.length; i++) {
			// process of comparing and swapping
			for (int j = 0; j < unsortedArray.length - 1; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					// swap both of them
					int temp = unsortedArray[j];
					// temp = 72
					unsortedArray[j] = unsortedArray[j + 1];
					// un[j] = 56
					unsortedArray[j + 1] = temp;
					// un[j+1] = 72;
				}

			}
		}

		return unsortedArray; // sorted
	}

	/*
	 * Challenge 2: Write a method that returns the max difference between any two
	 * numbers in an array of integers (you can use the sort method from challenge
	 * 1).
	 */

	public static int maxDiff(int[] array) {
		int[] sortedArray = sort(array);
		int maxDiff = sortedArray[sortedArray.length - 1] - sortedArray[0];
		return maxDiff;
	}

}
