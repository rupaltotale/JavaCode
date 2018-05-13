
public class Range implements NumberGroup {
	private int[] range;
	
	public Range(int min, int max) {
		range = new int[max-min];
		int position = 0;
		for(int i = min; i<max+1; i++) {
			range[position] = i;
			position++;
		}
	}
	
	
	public boolean contains(int contains) {
		for(int i = 0; i<range.length; i++) {
			if (i == contains) {
				return true;
			}
		}
		return false;
	}
}
