import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		// 1. Ask user to give two double inputs for length and breadth of a rectangle
		// and print area type casted to int.

		Scanner s1 = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double length = s1.nextDouble();
		System.out.println("What is the breadth of the rectangle?");
		double breadth = s1.nextDouble();
		int area = (int) (breadth * length);
		System.out.println("The area is " + area);

		// 2. Take name, roll number and field of interest from user and print in the
		// format below :
		// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
		Scanner s2 = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s2.nextLine();
		System.out.println("What is your field of interest?");
		String fieldOfInterest = s2.nextLine();
		System.out.println("What is your roll number?");
		int rollNumber = s2.nextInt();
		System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber
				+ ". My field of interest is " + fieldOfInterest);

		// 3. Ask the user for the name of a relative and then construct a fictional
		// city
		// with the name through the following steps:
		// Say the user input is “Hilton”.
		// a. Choose a random index (n) of the string. Let’s assume index (n) is 3 for
		// the
		// name Hitlon. Note: the index has to be smaller than the length of the input
		// b. Find the nth letter in the input. The 3rd letter in Hilton is “t” assuming
		// that “h” is 0th.
		// c. The fictional city name will be equal to the substring starting from index
		// n
		// to the end of the input and then the first part of the name (till index n)
		// will be appened to it. In this case, fictionalCity = tonhil (ton+hil)
		// More examples:
		// (i) Name = “beverly”, random index (n) = 3, fictionalCity = erlybev (erly +
		// bev)
		// (ii) Name = “rupal”, random index(n) = 2, fictionalCity = palru (pal + ru)
		// (iii) Name = “Sachin”, random index(n) = 4, fictionalCity = insach (in+ sach)

		Scanner s3 = new Scanner(System.in);
		System.out.println("What is the name of your relative?");
		String relativeName = s3.nextLine();
		// hilton: length = 6
		int randomIndex = (int) (Math.random() * relativeName.length()); // 0 -> length-1
		String fictionalCity = relativeName.substring(randomIndex) + relativeName.substring(0, randomIndex);
		String formatted = fictionalCity.substring(0, 1).toUpperCase() + fictionalCity.substring(1).toLowerCase();
		System.out.println("The fictional city you live in is " + formatted);
		/**
		 * NOTES
		 * 
		 * Math.random() returns a random decimal between 0 to 1
		 * 
		 * str.substring(a,b) where str is a String returns the substring from index a
		 * to b. For example, if we do s.substring(2, 5) where s is "elephant", then
		 * "eph" will be returned String fruit = "apple" apple.substring(0, 2); = ap
		 * 
		 * to cast to int, follow this format int n = (int) (some decimal)
		 * 
		 */
		String s = "ElephantsAreBig";
		String middleWord = s.substring(9,12);
		System.out.println("Middle word is " +middleWord);
		
		String lastWord = s.substring(12); 
		System.out.println("Last word is " + lastWord);
		
		String firstWord = s.substring(0,9 );
		System.out.println("First Word is "+firstWord);
		
		String input = "helloe";
		int index = input.length()/2;
		String newWord = input.substring(index) + input.substring(0, index);
		System.out.println(newWord);
	}

}
