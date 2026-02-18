package CoadingPratices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CovertStringUppercase {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("logesh","dilip","sai","sanjay");
		
//		list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
//		list.stream().filter(e->e.length()!=3).map(e->e.toUpperCase()).forEach(System.out::println);
		
		
		   List<String> list = Arrays.asList("ram", "kala", "anu", "abcd", "hi", "veer");

	        List<String> result = list.stream()
	                .map(s -> {
	                    if (s.length() == 3)
	                        return s.substring(0, 1).toUpperCase() + s.substring(1);
	                    else if (s.length() == 4)
	                        return s.substring(0, 2).toUpperCase() + s.substring(2);
	                    else
	                        return s;
	                })
	                .collect(Collectors.toList());

	        System.out.println(result);
		
	}

	

}
