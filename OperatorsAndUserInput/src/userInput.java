import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {

//		Scanner name = new Scanner(System.in);
		
//		System.out.println("Question");
//		String input = name.nextLine();
		
//		System.out.println("Question");
//		int number = name.nextInt();
//		System.out.println(input+number);
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("What is your name?");
//		String name = sc.nextLine();
//		
//		System.out.println("Oh your name is " + name);
//		
////		Ask the user for his/her age and print: hi + name. You are + age
//		
//		System.out.println("What is your age?");
//		int age = sc.nextInt();
//		
//		System.out.println("Hi " + name + "! You are " + age);


//		ask the user for their favorite animal and how many pets they have had. 
		
		System.out.println("What is your favorite animal? ");
		String animal = sc.nextLine();
		
		System.out.println("How many pets have you had?");
		int numberOfPets = sc.nextInt();
		
		System.out.println("fav animal: " + animal + "|| # of pets: " +  numberOfPets);

	}

}
