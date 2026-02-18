package CoadingPratices;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Basiccoading {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(10,9,8,7,6,5,4,3,2,1);
		
		List<String> list1= Arrays.asList("logesh","ajith","arjun","pavin");
//		Map<String,List<Integer>> result = list.stream().collect(Collectors.groupingBy(e->(e%2==0)?"Even":"odd"));
//		System.out.println("Even number"+result.get("Even"));
//		System.out.println("odd number"+result.get("odd"));
//
//		
//		
//		
		
		/// cont of add and even number 
//		
//		Map<String,Long> result = list.stream().collect(Collectors.groupingBy(e->(e%2==0)?"even":"odd",Collectors.counting()));
//		System.out.println("Even number counting ="+result.get("even"));
//		System.out.println("odd number counting = "+result.get("odd"));

		// second max
//		long res= list.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
//		System.out.println(res);
		
//		IntSummaryStatistics res = list.stream().distinct().mapToInt(e->e).skip(1).summaryStatistics();
//		System.out.println(res.getMax());
//		System.out.println(res.getMin());
		
		

		
		
	}

}
