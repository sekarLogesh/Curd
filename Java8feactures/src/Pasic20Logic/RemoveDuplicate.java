package Pasic20Logic;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String name = "logesh sekar";
		char[] ch = name .toCharArray();
		Map<Character,Integer> hm = new HashMap<>();
		for(char i=0;i<ch.length;i++) {
			boolean result = hm.containsKey(ch[i]);
			if(result != true) {
				hm.put(ch[i], 1);
			}
			else {
				int value = hm.get(ch[i]);
				hm.put(ch[i], value+1);
			}
			
		}
		
		
		for(Map.Entry<Character, Integer> entry :hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		
	
	}

}
