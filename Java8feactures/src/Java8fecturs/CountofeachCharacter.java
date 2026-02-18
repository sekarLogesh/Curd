package Java8fecturs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountofeachCharacter {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,45,1};
		 Arrays.stream(arr).sorted().distinct().mapToObj(String::valueOf).collect(Collectors.joining());
	
		
		 Character[] arr1 = {'1','2','3','h','s'};//we don't use char[] arr beacuse its return primitive streams so Arrays.stream(char[]) does not exist
		 String result =Arrays.stream(arr1).sorted().distinct().map(a-> a.toString()).collect(Collectors.joining());
	     System.out.println("string is "+result);
		

		
		String name = "logesh sekar";
		Map<Character,Long> map = name.chars()
				.mapToObj(e->(char) e)
				.collect(Collectors.groupingBy(e->e,LinkedHashMap::new , Collectors.counting()));
		
	Character firstnonrep=	map.entrySet().stream().filter(e->e.getValue()==1 && Character.isLetter(e.getKey()))
		.map(Map.Entry::getKey).findAny().orElse(null);
	System.out.println(firstnonrep);
	}

}
