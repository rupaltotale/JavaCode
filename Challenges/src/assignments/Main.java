package assignments;

import java.util.Scanner;

public class Main {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(2 % 3);
		System.out.println(10 % 11);
		int[] myarray = getIntegers(4);
		int[] another = getIntegers(4);
		getElement(myarray, another);
	}

	public static int[] getIntegers(int numbers) {
		int[] values = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			System.out.println("Enter a number: ");
			values[i] = input.nextInt();
		}
		return values;
	}

	public static void getElement(int[] myarray, int[] another) {
		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < another.length; j++) {
				if (myarray[i] == another[j]) {
					System.out.println("Commom Element Is : " + another[j]);
				}
			}
		}
	}
}