package assignments;

import java.util.Scanner;

public class Assignment1Solutions {
	public static void main(String[] args) {
		/**
		 * Question1 Write a Java method to count all vowels in a string. Hint: Use
		 * substring() for this challenge question. You can also use charAt().
		 */

		String wordWithVowels = "apple";
		int numberOfVowels = 0;
		for (int i = 0; i < wordWithVowels.length(); i++) {
			if (wordWithVowels.substring(i, i + 1).equals("a") || wordWithVowels.substring(i, i + 1).equals("e")
					|| wordWithVowels.substring(i, i + 1).equals("i") || wordWithVowels.substring(i, i + 1).equals("o")
					|| wordWithVowels.substring(i, i + 1).equals("u")) {
				numberOfVowels++;
			}
		}
		System.out.println("The number of vowels in " + wordWithVowels + " is " + numberOfVowels);

		/**
		 * Question 2 Write a Java method to count all words in a string entered by a
		 * user. Assume that each word is separated by a SINGLE SPACE and that there is
		 * at least 1 word. Example: "This is a big world" has 4 words
		 * 
		 */
		String sentenceWithWords = "I was born in India";
		int numberOfWords = 1;
		for (int i = 0; i < sentenceWithWords.length(); i++) {
			if (sentenceWithWords.substring(i, i + 1).equals(" ")) {
				numberOfWords++;
			}
		}
		System.out.println("The number of words in '" + sentenceWithWords + "' is " + numberOfWords);

		/**
		 * Question 3 Write a Java method to check whether a string entered by a user is
		 * a valid password. Password rules: A password must have at least ten
		 * characters. A password must have at least one uppercase letter. A password
		 * must contain at least two digits. Note: Password MUST meet all 3 rules.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a password: ");
		String password = s.nextLine();
		boolean validPassword = true;
		if (password.length() < 10) {
			validPassword = false;
		}
		boolean allLowercase = password.equals(password.toLowerCase());
		// explanation for the above code (line number ): if the original password is
		// equal to password converted to all lowercase, then boolean lowercase will be
		// true and this implies that there are no uppercase letters in the
		// password. If lowercase is false, then there is an uppercase in the password.
		// remember: .equals() is CASE SENSITIVE i.e APPLE does not equal apple
		if (allLowercase) { // lowercase == true
			validPassword = false;
		}
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.substring(i, i + 1).equals("1") || password.substring(i, i + 1).equals("2")
					|| password.substring(i, i + 1).equals("3") || password.substring(i, i + 1).equals("4")
					|| password.substring(i, i + 1).equals("5") || password.substring(i, i + 1).equals("6")
					|| password.substring(i, i + 1).equals("7") || password.substring(i, i + 1).equals("8")
					|| password.substring(i, i + 1).equals("9") || password.substring(i, i + 1).equals("0")

			) {
				numberOfDigits++;

			}
		}
		if (numberOfDigits < 2) {
			validPassword = false;
		}
		if (validPassword) {
			System.out.println("The password you entered is VALID");
		} else {
			System.out.println("The password you entered is INVALID");
		}

		/**
		 * Question 4 Given an integer n, perform the following conditional actions:
		 * 
		 * If n is odd, print "red". If n is even and in the inclusive range of 2 to 5
		 * print "blue" (2,3,4,5). If n is even and in the inclusive range of 6 to 20
		 * print "green" (6,7,8..20). If n is even and greater than 20 print "yellow"
		 */
		int n = 4;
		if (n % 2 == 1) {
			System.out.println("red");
		} else if (n >= 2 && n <= 5) {
			System.out.println("blue");
		} else if (n <= 6 && n >= 20) {
			System.out.println("green");
		} else {
			System.out.println("yellow");
		}
		/**
		 * Question 5 Write a Java program to find the common elements between two
		 * arrays (int values) and print the similar elements to the console. Assume
		 * that both arrays have the same length (equal number of int elements)
		 * 
		 * For example, for:
		 * 
		 * int[] array1 = {2, 3, 4};
		 * 
		 * int[] array2 = {3, 6,7};
		 * 
		 * 3 is printed out to the console
		 */
		int[] aX = { 2, 3, 45, 7 }; // short for array X
		int[] aY = { 3, 5, 7, 54 }; // short for array Y
		for (int x = 0; x < aX.length; x++) {
			for (int y = 0; y < aY.length; y++) {
				if (aX[x] == aY[y]) {
					System.out.print(aX[x]); // or System.out.println(aY[y]);
				}
			}
		}
	}

}
