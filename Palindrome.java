import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1:
		String input = "testleaf";
		String test="";
		for (int i = input.length()-1; i >= 0; i--) {
			
			char charat = input.charAt(i);
			test+=charat;
			
		}
			if (input.equals(test)) {
				System.out.println("Yes Palindrome");
			} else {
				System.out.println("No not a Palindrome");
			}
		
		//Method 2:
		
			String input1 = "testleaf";
			String rev = new StringBuffer(input1).reverse().toString();
			System.out.println(input1.equals(rev)?"Yes Palindrome":"Not a Palindrome");
			
	

	}

}
