package CoadingPratices.Employee;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Coading {

	public static void main(String[] args) {

		int[] arr = {1,2,34,5,6,7,1,2,34,5,566,3};
		Map<Integer,Long> map = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));
		
		map.entrySet().stream().filter(e->e.getValue()>1)
		.map(Map.Entry::getKey).forEach(System.out::println);
	}

}
