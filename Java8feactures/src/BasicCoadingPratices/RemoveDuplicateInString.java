package BasicCoadingPratices;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
//		String[] arr = {"logesh","logesh","logesh","sekar","ajith"};
//		int count=0;
//		String visited = "-1";
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=visited) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[j]== arr[i]) {
//						count++;
//						arr[j]=visited;
//					}
//				}
//
//			}
//		}
//		System.out.println(count);
//		
//		String name = "logeshSekar";
//		char visited  = '1';
//		char[] ch= name.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!=visited) {
//				for(int j=i+1;j<ch.length;j++) {
//					if(ch[j]==ch[i]) {
//						ch[j]=visited;
//						
//					}
//					
//				}
//				System.out.println(ch[i]);
//			}
//		}
		
		
		
	String name = "logeshSekar@gmail";
	name = name.toLowerCase();
	int possion=0;
	Map<Character,Integer> hm = new LinkedHashMap<>();
	for(char ch :name.toCharArray()) {
		boolean result = hm.containsKey(ch);
		if(result != true ) {
			hm.put(ch, 1);
		}
		else {
			int value = hm.get(ch);
			hm.put(ch, value+1);
		}
	}

		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			if(entry.getValue().equals(1)&& Character.isLetter(entry.getKey())) {
				possion++;
				if(possion==2) {
					System.out.println(entry.getKey());break;
				}
			}
		}
		
		
		
		
		
		
		
		
      	}

}
