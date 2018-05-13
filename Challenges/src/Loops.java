
public class Loops {

	public static void main(String[] args) {
		// ******************** 1 *************************
		// Write a program in Java to display the n terms of odd natural numbers and
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
		// 11
		// The Sum of odd Natural Number upto 5 terms is: 25

		int input = 6;
		int oddNum = 1;
		int sum = 0;

		for (int i = 0; i < input; i++) {
			System.out.println(oddNum);
			sum += oddNum; // sum = sum + oddNum
			oddNum += 2; // oddNum = oddNum + 2
		}
		System.out.println("The sum of the first " + input + " odd numbers is " + sum);

		// ******************** 2 *************************
		// Write a program in Java to make such a pattern like right angle triangle with
		// number increased by 1.The pattern like
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20 21
		//

		int height = 5;
		int count = 1;

		for (int h = 1; h < height + 1; h++) {
			for (int spot = 1; spot <= h; spot++) {
				System.out.print(count + " ");
				count++; // count = count + 1
			}
			System.out.println();
		}

	}
//	int a=5;
//	int count=1;
//	for(h=1;h<=a;h++);
//	{ for(j=1;j<=a;j++);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
