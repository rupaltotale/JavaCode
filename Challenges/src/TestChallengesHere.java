import java.util.Scanner;

//1. Ask user to give two double input for length and breadth of a rectangle
// and print area type casted to int.

// 2. Take name, roll number and field of interest from user and print in the
// format below :
// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

// 3. Ask the user for the name of a relative and then construct a fictional city
// with the name through the following steps:
// Say the user input is “Hilton”.
// a. Choose a random index (n) of the string. Let’s assume index (n) is 3 for the
// name Hitlon. Note: the index has to be smaller than the length of the input
// b. Find the nth letter in the input. The 3rd letter in Hilton is “t” assuming
// that “h” is 0th.
// c. The fictional city name will be equal to the substring starting from index n
// to the end of the input and then the first part of the name (till index n)
// will be appened to it. In this case, fictionalCity = tonhil (ton+hil)
// More examples:
// (i) Name = “beverly”, random index (n) = 3, fictionalCity = erlybev (erly + bev)
// (ii) Name = “rupal”, random index(n) = 2, fictionalCity = palru (pal + ru)
// (iii) Name = “Sachin”, random index(n) = 4, fictionalCity = insach (in+  sach)

/**
 * NOTES 
 * 
 * Math.random() returns a random decimal between 0 to 1
 * 
 * str.Substring(a,b) where str is a String returns the substring from index a
 * to b. For example, if we do s.substring(2, 5) where s is "elephant", then "eph" will be returned
 * 
 * to cast to int, follow this format int n = (int) (some decimal)
 * 
 */

public class TestChallengesHere {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 1. Ask user to give two double input for length and breadth of a rectangle
		// and print area type casted to int.
//		System.out.println("What is the length?");
//		double length = s.nextDouble();
//		System.out.println("What is the breadth?");
//		double breadth = s.nextDouble();
//		int area = (int) (breadth * length);
//		System.out.println("The area is " + area);


		// 2. Take name, roll number and field of interest from user and print in the
		// format below :
		System.out.println("What is your field of interest?");
		String fieldOfInterest = s.nextLine();
		// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
		System.out.println("What is your roll number?");
		int rollNumber = s.nextInt();
		System.out.println("Hey, my name is Rupal and my roll number is " + rollNumber + ". My field of interest is "
				+ fieldOfInterest);
		

		// 3. Ask the user for the name of a relative and then construct a fictional
		// city with the name through the following steps:
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

		
		System.out.println("What is your relative's name? ");
		String relativeName;
		if(s.hasNext()) {
			relativeName = s.nextLine();			
			int n = (int) (Math.random() * relativeName.length());// random index
			String fictionalCity = relativeName.substring(n) + relativeName.substring(0, n);
			System.out.println(fictionalCity.toLowerCase());
		}

	}
}
