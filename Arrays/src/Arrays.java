
public class Arrays {

	public static void main(String[] args) {
		
//		dataType[] arrayName1 = new dataType[numberOfSpots];
//		arrayName1 [0] = someValue;
//		arrayName1 [1] = someValue1;
//		arrayName1 [2] = someValue2;
//		................
//		arrayName1 [numberOfSpots-1] = someValueN;
		
//		***********OR*****************
//		String[] arrayName2 = {someValue, someValue1, someValue2......someValueN};
		
		String[] animals = new String[5];
		animals[0] = "dog";
		animals[1] = "cat";
		animals[2] = "horse";
		animals[3] = "elephant";
		animals[4] = "lion";
		
		String[] animals1 = {"dog", "cat", "horse", "elephant", "lion"};
		
		System.out.println(animals[2]);
		
//		an array of multiples of three: first five
		
		int[] multiple = new int[5];
		multiple[0] = 3;
		multiple[1] = 6;
		multiple[2] = 9;
		multiple[3] = 12;
		multiple[4] = 15;
		
		int[] multiple1 = {3, 6, 9, 12, 15};
		
		System.out.println(multiple[3]);
		
 
		for(int i = 0; i<multiple.length; i++) {
			System.out.println(multiple[i]);
		}
		
//		print out animals
		
		for(int j = 0; j<animals.length; j++) {
			System.out.println(animals[j]);
		}
		
		
	}

}
