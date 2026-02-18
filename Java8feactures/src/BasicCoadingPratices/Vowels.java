package BasicCoadingPratices;

import java.util.LinkedHashMap;
import java.util.Map;

public class Vowels {

	public static void main(String[] args) {
		

		String name = "logesh sekar";
		
//		 name.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)).
//		char resusss=' ';
		
//		Map<Character,Integer> map = new LinkedHashMap<>();
//		for(char ch :name.toCharArray()) {
//			
//			boolean result = map.containsKey(ch);
//			if(result !=true) {
//				map.put(ch, 1);
//			}
//			else {
//				int value = map.get(ch);
//				map.put(ch, value+1);
//			}
//			for(Map.Entry<Character, Integer>entry :map.entrySet()) {
//				if(entry.getValue()==1) {
//					resu= entry.getKey();
//					break;
//				
//					
//				}
//			}
//			
//
//			
//		}
//		System.out.println("first non reperting character = "+resu);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		name.chars().mapToObj(c->(char) c).filter(e->"auioeAUIOE".indexOf(e)!=-1).forEach(System.out::println);
//		long counts= name.chars().mapToObj(c->(char)c).filter(ch->"AEIOUaeiou".indexOf(ch)!=-1).count();
//		System.out.println(counts);
		
//		int[] arr = {10,2,3,45,6,778,9};
//		Arrays.stream(arr).forEach(e->{
//			if(e%2==0)
//				System.out.println("even"+e);
//			else
//				System.out.println("add"+e);
//		});
		
		
		
		
		
		String str = "logesh sekar";
		int count=0;
		str = str.toLowerCase();
		Map<Character,Integer> hm = new LinkedHashMap<Character, Integer>();
		for(char ch :str.toCharArray()) {
			boolean result = hm.containsKey(ch);
			if(result == false) {
				hm.put(ch, 1);
			}
			else {
				int value = hm.get(ch);
				hm.put(ch,value+1 );
			}
		}
		
		
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			if(entry.getValue()==1 && Character.isLetter(entry.getKey())) {
				count++;
				if(count==2) {
					System.out.println(entry.getKey());
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
