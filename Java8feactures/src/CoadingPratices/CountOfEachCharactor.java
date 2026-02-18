package CoadingPratices;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachCharactor {

	public static void main(String[] args) {
		
		String str = "logeshSekar";
		Map<Character,Long> countofeachchar = str.toUpperCase().chars().filter(e->e!=' ').mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(countofeachchar);
	}

}
