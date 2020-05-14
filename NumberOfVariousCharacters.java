
public class NumberOfVariousCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Method 1:
		String input = "1.It is Work from Home not Work for Home";
		
		char[] array = input.toCharArray();	
		
		int number = 0;
		int upper = 0;
		int lower = 0;
		int space = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (Character.isDigit(array[i])) {
				number++;
			}else if (Character.isWhitespace(array[i])) {
				space++;
			} else if (Character.isLowerCase(array[i])) {
				lower+=1;
			}else if (Character.isUpperCase(array[i])) {
				upper++;
			}
				
			}
		System.out.println("Number = "+number+" Upper = "+upper+" Lower = "+lower+" Space = "+space);
		
		//Method2 :
		
		int number1 = 0;
		int upper1 = 0;
		int lower1 = 0;
		int space1 = 0;
		
		String Upper = input.replaceAll("[A-Z]","*");
		char[] cs = Upper.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i]=='*') {
				upper1++;
			}
		}
		String Lower = input.replaceAll("[a-z]","*");
		char[] csl = Lower.toCharArray();
		for (int i = 0; i < csl.length; i++) {
			if (csl[i]=='*') {
				lower1++;
			}
		}
		String Space = input.replaceAll("\\s","*");
		char[] css = Space.toCharArray();
		for (int i = 0; i < css.length; i++) {
			if (css[i]=='*') {
				space1++;
			}
		}
		String Number = input.replaceAll("[0-9]","*");
		char[] csn = Number.toCharArray();
		for (int i = 0; i < csn.length; i++) {
			if (csn[i]=='*') {
				number1++;
			}
		}
		
		System.out.println("Number = "+number1+" Upper = "+upper1+" Lower = "+lower1+" Space = "+space1);
		
		
		}
		
	}

