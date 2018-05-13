import java.util.List;

public class MultipleGroups implements NumberGroup {
	private List<NumberGroup> groupList;

	@Override
	public boolean contains(int contains) {
		for(int i = 0; i<groupList.size(); i++) {
			if(groupList.get(i).contains(contains)) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
