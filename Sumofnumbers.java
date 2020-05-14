
public class Sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1:
String input = "5adj7fjv3sfjdv";
String test = input.replaceAll("[a-zA-Z]","");
int total = 0;
for (int i = 0; i < test.length(); i++) {
	char a = test.charAt(i);
	
	int digits = Integer.parseInt(String.valueOf(a));
	total+=digits;
	
}

System.out.println(total);

	//Method 2:
	String input1 ="a5dkaih7acdddd3c";
	int Sum = 0;
	char[] array = input1.toCharArray();
	for (int i = 0; i < array.length; i++) {
	
		char check = array[i];
		if (Character.isDigit(check)) {
			
			Sum += Integer.parseInt(String.valueOf(check));
		}
		
	}
System.out.println(Sum);


	}

}
