package CoadingPratices.Employee;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepertingChar {

	public static void main(String[] args) {
		
		String str = "Sekarkannnan";

		Character chas = str.chars()// int stream
		        .mapToObj(c -> (char) c)
		        .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
		        .skip(2)
		        .findFirst()
		        .orElse(null);

		System.out.println(chas + " first");

		String name = "selvasuthan";
		char[] cha = name.toCharArray();
		Map<Character,Integer> hm = new LinkedHashMap<>();
		
		for(char ch:cha) {
			boolean result = hm.containsKey(ch);
			if(result != true ) {
				hm.put(ch, 1);
			}
			else {
				int value = hm.get(ch);
				hm.put(ch, value+1);
			}
		}
		for(Map.Entry<Character, Integer> entry :hm.entrySet()) {
			if(entry.getValue()==1) {
//				System.out.println(entry.getKey());
				return;
			}
		}
		
		
		

		
	}

}
