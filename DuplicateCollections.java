import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCollections {

	public static void main(String[] args) {
		
		String input = "When life gives you lemons, make lemonade";
		
		List<String> check = new ArrayList<String>();
		
		for (int i = 0; i < input.length(); i++) {
			input.charAt(i);
			check.add(String.valueOf(input.charAt(i)));
			
		}
		
		Collections.sort(check);
		String output = "";
		for (int i = 0; i < check.size()-1; i++) {
			String charat = check.get(i);
			if (charat.equals(check.get(i+1))) {
				if (output.contains(charat)) {
					output+="";	
				}else {
					output += charat;
				}
				
			}
		}
		System.out.println(output);
		
		
		Set<Character> set = new LinkedHashSet<Character>();
		String str = "When life gives you lemons, make lemonade";
		for (int i = 0; i < str.length(); i++) {
			if(!set.add(str.charAt(i))) {
				System.out.print(str.charAt(i)+",");
			}

	}
	}
}
