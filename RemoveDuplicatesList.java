import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		String List = "A,B,C,D,A,D,E,F";
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < List.length(); i++) {
			
			set.add(List.charAt(i));
		}
		System.out.println(set);

	}

}
