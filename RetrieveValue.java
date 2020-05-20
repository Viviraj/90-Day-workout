import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RetrieveValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		//Method 1:
		String Set = "1,2,3,4,5,6,7,8,9";
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < Set.length(); i++) {
		
			set.add(Set.charAt(i));
			
		}

		List<Character> list = new ArrayList<Character>(set);
		
		list.indexOf('7');
		System.out.println(list.get(list.indexOf('7')));
		
		//Method 2:
		
		for (Character character : list) {
			if (character=='7') {
				System.out.println(character);
			}
		}
		
		//Method 3:
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals('6')) {
				System.out.println(it.next());
			}
			
		}
		
	}

}
