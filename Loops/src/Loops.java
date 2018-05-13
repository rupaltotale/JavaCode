
public class Loops {
	public static void main(String[] args) {
		// while loops
		// syntax:
		// while(condition){
		// instructions
		// }
		int x = 0;
		while (x < 10) {
			System.out.println("Hello");
			x++;
		}

		// print out numbers 1-10;
		int number = 1;
		while (number < 11) {
			System.out.println(number);
			number++;
			// number = number+1;
		}

		// for loops
		// syntax:
		// for(someVariable initialized; condition; someVariable = someVariable-2) {
		//instruction
		// }
		
		for(int j = 0; j<10; j++) {
			System.out.println("hello");
		}
//		print out numbers 1-10 using a for loops
		
		for(int someNumber = 1; someNumber <11; someNumber++) {
			System.out.println(someNumber);
		}
		
//		print out the times table for 3 using a for and while loop
		
		int myNumber = 1;
		while(myNumber<11) {
			System.out.println(myNumber*3);
			myNumber++;
		}
		
		for(int g = 1; g<11; g++) {
			System.out.println(g*3);
		}
		

	}

}
