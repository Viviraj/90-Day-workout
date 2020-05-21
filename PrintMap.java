import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class PrintMap {

	public static void main(String[] args) {
		Map<Character,Integer> value = new TreeMap<Character,Integer>();
		
		value.put('A',1);
		value.put('B',2);
		value.put('C',3);
		value.put('D',4);
		value.put('E',5);
		
		//Method 1:
		for (Entry<Character,Integer> single : value.entrySet()) {
			
			System.out.println(single.getKey()+"->"+single.getValue());
			
		}
			System.out.println("--------------------------------------------------");
		//Method 2:
			
			Iterator <Entry<Character,Integer>> second = value.entrySet().iterator();
			
			while (second.hasNext()) {
				
				Entry<Character,Integer> entry = second.next();
				System.out.println(entry.getKey()+"->"+entry.getValue());
				
				}
				System.out.println("--------------------------------------------------");
				
				//Method 3:
				value.forEach((eachkey,eachvalue)->System.out.println(eachkey+"->"+eachvalue));
			
				System.out.println("--------------------------------------------------");
				//Method 4 :
				
				value.keySet().forEach((key)->System.out.println(key+"->"+value.get(key)));
		
	}

}
