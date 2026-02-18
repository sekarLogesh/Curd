package CoadingPratices.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapValue {

	public static void main(String[] args) {

	
		Map<Character,Integer> map = new LinkedHashMap<>();
		String name = "logeshSekar";
		name = name.toLowerCase();
		for(char ch:name.toCharArray()) {
			boolean result = map.containsKey(ch);
			if(result == false) {
				map.put(ch,  1);
			}
			else {
				int value = map.get(ch);
				map.put(ch, value+1);
			}
		}
		int count =0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				count++;
				if(count==2) {
					System.out.println(entry.getKey()+"  Second non reperting character");
				}
				
			}
		}
	}

}
