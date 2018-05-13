

public class ConditionalStatements {
	public static void main(String[] args) {

		// if/else syntax
		// if(condition ex 2==2){
		// action ex print(hello world)
		// }

		// else if(condition){
		// action
		// }

		// multiple else ifs
		// else{
		// action
		// }

		// example
		int number1 = 6;
		int number2 = 5;

		// = means to assign
		// == means to check for equality
		if (number1 == number2) {
			System.out.println("Number one is equal to number two");
		}

		else if (number1 > number2) {
			System.out.println("Number one is greater than number two");
		}

		else {
			System.out.println("Number one is less than number two");
		}

		// else {
		// System.out.println("Number one is not equal to number two");
		// }

		// switch statements

		String someVariable = "hello";
		// switch(object){
		// case (value, bye):
		// action
		// break;

		// case (value2):
		// action2
		// break;

		// case (value3):
		// action3
		// break;}

		String power = "on";

		switch (power) {
		case ("off"):
			System.out.println("Power is off");
			break;
		case ("on"):
			System.out.println("The power is on");
			break;

		}


		
		
	}
}
