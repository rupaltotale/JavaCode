import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] n = {2,5,6,8, 3, 12};
		System.out.println(maxDiff(n));

	}

	/*
	 * Challenge 1: Create a method that takes an unsorted array of integers, sorts
	 * it, and returns the sorted array.
	 */
	
	/*
	 * Challenge 2: Write a method that returns the max difference between any two
	 * numbers in an array of integers (you can use the sort method from challenge
	 * 1).
	 */
	public static int[] sort(int[] unsortedArray) {
		for (int i = 0; i < unsortedArray.length; i++) {
			for (int j = 0; j < unsortedArray.length - 1; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j + 1];
					unsortedArray[j + 1] = temp;
				}
			}
		}

		return unsortedArray; // now it is sorted
	}

	/*
	 * Challenge 2: Write a method that returns the max difference between any two
	 * numbers in an array of integers (you can use the sort method from challenge
	 * 1).
	 */
	public static int maxDiff(int[] n) {
		int[] sortedArray = sort(n);
		int maxDiff = sortedArray[sortedArray.length -1] - sortedArray[0];
		return maxDiff;
		
	}

}
