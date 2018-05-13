
public class Variables {
	// challenge #1
	// Write a Java program that reads a number in inches,
	// converts it into meters.
	// Note: One inch is 0.0254 meter.
	// Test Data
	// Input a value for inch: 1000
	// Expected Output :
	// 1000.0 inch is 25.4 meters

	public static void main(String[] args) {
		double inchVal = 20000;
		double meterVal = inchVal * 0.0254;
		System.out.println(inchVal + " inches is " + meterVal + " meters.");

		


}
}
//public static void main(String[] args) {
//	// ******************** 1 *************************
//	// Write a program in Java to display the n terms of odd natural numbers and
//	// their sum.
//	// Test Data
//	// Input number of terms is: 5
//	// Expected Output :
//	// The odd numbers are :
//	// 1
//	// 3
//	// 5
//	// 7
//	// 9
//	// The Sum of odd Natural Number upto 5 terms is: 25
//
//	int input = 6;
//	int sum = 0;
//	int oddNum = 1;
//	System.out.println("***** for loop for # 1 *******");
//	for (int i = 0; i < input; i++) {
//		System.out.println(oddNum);
//		sum = sum + oddNum;// sum += oddNum;
//		oddNum += 2;// same thing as oddNum = oddNum + 2
//
//	}
//	System.out.println("The sum is " + sum);
//
//	
//	System.out.println("***** while loop for # 1 *******");
//	while (input > 0) {
//		System.out.println(oddNum);
//		sum = sum + oddNum;// sum += oddNum;
//		oddNum += 2;// same thing as oddNum = oddNum + 2
//		input--;
//
//	}
//	System.out.println("The sum is " + sum);
//
//	// ******************** 2 *************************
//	// Write a program in Java to make such a pattern like right angle triangle with
//	// number increased by 1.The pattern like
//	// 1
//	// 2 3
//	// 4 5 6
//	// 7 8 9 10
//	// 11 12 13 14 15
//	System.out.println("***** for loop for # 2 *******");
//	int height = 5;
//	int count = 1;
//	for (int h = 1; h < height + 1; h++) {
//		for (int spot = 0; spot < h; spot++) {
//			System.out.print(count + " ");
//			count++;
//		}
//		System.out.println();
//	}
//	System.out.println("***** while loop for # 2 *******");
//	int h = 1;
//	while (h<=height) {
//		int spot = 0;
//		while (spot < h) {
//			System.out.print(count + " ");
//			count++;
//			spot ++;
//		}
//		h++;
//		System.out.println();
//	}
//}
//
//}

//******************** 1 *************************
//Write a program in Java to display the n terms of odd natural numbers and
// their sum.
// Test Data
// Input number of terms is: 5
// Expected Output :
// The odd numbers are :
// 1
// 3
// 5
// 7
// 9
// The Sum of odd Natural Number upto 5 terms is: 25

// ******************** 2 *************************
// Write a program in Java to make such a pattern like right angle triangle with
// number increased by 1.The pattern like
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15