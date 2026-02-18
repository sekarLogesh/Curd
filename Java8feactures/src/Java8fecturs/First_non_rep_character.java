package Java8fecturs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class First_non_rep_character {

	public static void main(String[] args) {
		String name = "logesh sekar";
		Map<Character,Long> map = name.chars()
				.mapToObj(e->(char)e)
				.collect(Collectors.groupingBy(c->c,LinkedHashMap::new ,Collectors.counting()));

		Character findfirstnon = map.entrySet().stream().filter(
				e->e.getValue()==1 && Character.isLetter(e.getKey())
				).map(Map.Entry::getKey)
				.findFirst().orElse(null);
		System.out.println(findfirstnon);

	}
	

}
