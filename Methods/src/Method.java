
public class Method {

	public static void main(String[] args) {
		// Syntax
		// returnType methodName(dataType a, dataType b) {
		// body
		// }

		addition(3, 1222);
		int number = multiplication(3, 5, 6);
		System.out.println(number / 2);
		
		double minimum = minimum(4.5, 4.5);
		if(minimum != -1) {
			System.out.println(minimum);
		}
		else {
			System.out.println("They are equal");
		}
		

	}

	static void addition(int a, int b) {
		System.out.println(a + b);

	}

	static int multiplication(int a, int b, int c) {
		int multipliedValue = a * b * c;
		return multipliedValue;
	}
//	have a method that takes in two numbers of type double and returns the number that is 
//	minimum. if they are equal then return -1. 
	
	static double minimum (double a, double b) {
		if (a < b) {
			return a;
		}
		else if(b<a) {
			return b;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
}
