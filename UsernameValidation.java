import java.util.regex.Pattern;

public class UsernameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "teScssdkk";
		String regex = "[a-zA-Z0-9._@$]{8,}";
		
		boolean output = Pattern.matches(regex, input);
		
		System.out.println(output);
		
	}

}
