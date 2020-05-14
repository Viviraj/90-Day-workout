import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReverseAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method 1:
		String input ="When the world realise its own mistake, corona will dissolve automatically";
		String[] split = input.split("\\s");
		
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
				buffer.append(new StringBuffer(split[i]).reverse()).append(" ");
				
			}else {
				buffer.append(new StringBuffer(split[i])).append(" ");
			}
			
		}
		System.out.println(buffer);
		
		//Method 2:
		
		String input1 = "When the world realise its own mistake, corona will dissolve automatically";
		String[] split1 = input1.split("\\s");
		
		Map<Integer,String> test1 = new LinkedHashMap<Integer,String>();
		
		for (int i = 0; i < split1.length; i++) {
			
			String rev = split1[i];
			String word = "";
			if (i % 2 != 0) {
				for (int j = rev.length()-1; j >= 0; j--) {
					
					word += rev.charAt(j);
				}
				test1.put(i, word);
				
			}else {
				test1.put(i, split1[i]);
			}
		}
	
		String result = "";
		for (int i = 0; i < split1.length; i++) {
			String string = test1.get(i);
			result=result+" "+string;
		}
	System.out.println(result);	
	}

}
