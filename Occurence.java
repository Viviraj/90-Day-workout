
public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1:
		String input = "You have no choice other than following me!";
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			
			char check = input.charAt(i);
		if(check=='o') {
			count++;
		}
			
		}
		System.out.println("The Count of o is "+count);
		
		//Method 2:
		
		String input1 = "You have no choice other than following me!";
		char[] charArray = input1.toCharArray();
		int count1 = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='o') {
				count1+=1;
			}
		}
		System.out.println("The Count of o is "+count1);
		
		//Method3:
		
		String input2 = "You have no choice other than following me!";
		String count2 = input2.replaceAll("[^o]","");
		System.out.println("The COunt of o is "+count2.length());
	}

}
