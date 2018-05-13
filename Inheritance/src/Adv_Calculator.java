
public class Adv_Calculator extends Basic_Calculator{
// multiply and divide 
//	basic : a - b// b-a
	
	@Override
	public int subtract (int a, int b) {
		return b-a;
	}
	
	@Override
	public int add(int a, int b) {
		System.out.println("Adding a and b...");
		return a+b;
	}

	public double multiply(double a, double b) {
		return a*b;
		
	}
	
	public double divide (double a, double b) {
		return a/b;
	}
}
