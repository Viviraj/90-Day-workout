import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountOfChar {

	public static void main(String[] args) {
		
		String str = "Karma is powerful than God";
		
		Map<Character,Integer> count = new TreeMap<Character,Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			if (count.containsKey(str.charAt(i))) {
				
				Integer integer = count.get(str.charAt(i));
				integer++;
				count.put(str.charAt(i), integer);
			}else {
				count.put(str.charAt(i), 1);
			}
			
		}
		
		System.out.println(count);
		
		//Method 2 :
		Map<Character,Integer> count2 = new TreeMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
		count2.put(str.charAt(i),1);		
		}
		for (int i = 0; i < str.length(); i++) {
		
			String update = str.replaceAll(String.valueOf(str.charAt(i)), "*");
			int nos=0;
			for (int j = 0; j < update.length(); j++) {
				if (update.charAt(j)=='*') {
					nos++;
				}
			}
					count2.put(str.charAt(i),nos);	
			}
		System.out.println(count2);
	}

}
