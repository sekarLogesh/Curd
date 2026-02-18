package Exp_Coading;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class first_non_rep_character {

	public static void main(String[] args) {

		String name = "logeshSekar";
		Map<Character,Long> map = name.toLowerCase().chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
		
		Character ch = map.entrySet().stream().filter(e->e.getValue()==1 && Character.isLetter(e.getKey()) )
				.map(Map.Entry::getKey)
				.findFirst().get();
		
		System.out.println(ch);
	}

}
