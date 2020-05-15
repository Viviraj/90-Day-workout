import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ttest@gmail.com";
		String regex = "[A-Za-z0-9._]+@[a-z]+.[a-z.]{2,}";
			
		boolean matches = Pattern.matches(regex, input);
		//or
		
		Pattern compile = Pattern.compile(regex);
		Matcher match = compile.matcher(input);
		boolean matches2 = match.matches();
		
		System.out.println(matches2);
	}

}
