
public class Arrays {

	public static void main(String[] args) {
		// 1. Write a Java program to find the index of an array element. Print "not
		// found" if the element does not exist in the array.
		int[] numbers = { 67, 8, 9, 10, 41, 32 };
		int index = 80;
		boolean indexFound = false;
		for (int n = 0; n < numbers.length; n++) {
			if (index == numbers[n]) {
				System.out.println(index + " "
						+ "is located at position " + n + " in the array numbers");
				indexFound = true;
			}

		}
		if(indexFound == false) { //!indexFound
			System.out.println(index + " was not found in the array numbers.");
			
		}

		// 2. Write a Java program to copy an array by iterating the array. Use a for or
		// a while loop to do this. Hint: This challenge is similar to printing the
		// elements of an array
		
		String[] words = {"sleepy", "morning", "dogs", "school"};
		String[] duplicate = new String[words.length];
		int s = 0;
		while(s<words.length) {
			duplicate[s] = words[s];
			System.out.println(duplicate[s]);
			s++;
		}
		// 3. Write a Java program to find the maximum and minimum value of an array.
		double[] decimals = {3.4, 2.8, 90.3, 178.6, 1.4, 204.5};
		double max = Double.MIN_VALUE; //0
		double min = Double.MAX_VALUE;
		for(int d =0; d< decimals.length; d++) {
			if(max < decimals[d]) {
				max = decimals[d]; //upgrading
			}
			if(min>decimals[d]) {
				min = decimals[d]; //downgrading
			}
		}
		System.out.println("The max in array decimals is " + max);
		System.out.println("The min in array decimals is " + min);

	}

}
