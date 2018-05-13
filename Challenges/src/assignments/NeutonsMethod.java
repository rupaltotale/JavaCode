package assignments;

public class NeutonsMethod {
	public static void main(String[] args) {
		int x = 3;
		System.out.println(nm(100, 100));

	}

	public static double nm(double x, double times) {
		if (times == 0) {
			return x;
		}
		
		x = x - f(x)/fPrime(x);
		times = times -1;
		return nm(x, times);

	}

	private static double fPrime(double x) {
		return (Math.pow ( x,5 ) * 6);
	}

	private static double f(double x) {
		// TODO Auto-generated method stub
		return (Math.pow ( x,6 ) -1000);
	}
}
