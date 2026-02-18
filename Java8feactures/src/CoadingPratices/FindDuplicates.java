package CoadingPratices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		
		// find Starting with A
		
		List<String> list = Arrays.asList("ajai","ajith","logesh","sanjay");
		
		long count = list.stream().filter(e->e.startsWith("a")).collect(Collectors.counting());
		System.out.println(count+" ");
		
		

	}

}
