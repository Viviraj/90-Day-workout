import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintInList {

	public static void main(String[] args) {
		String input = "B,u,g,a,t,t,i, ,C,h,i,r,o,n";
		
		List<Character> test = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			test.add(input.charAt(i));
			System.out.print(test.get(i));
		}

		System.out.println(" ");
		
		//Method 2:
		for (Character character : test) {
			System.out.print(character);
		}
		System.out.println(" ");
		
		
		//Method 3:
		Iterator text = test.iterator();
		while (text.hasNext()) {
			System.out.print(text.next());
			
		} 
			
	}

}
