package BasicCoadingPratices;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamprintaddsumAndEvansum {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1,2,3,4,5,5);
//		Map<String,List<Integer>> map = list.stream().collect(Collectors.groupingBy(e->e%2==0?"even":"add"));
//		int evensum= map.get("even").stream().mapToInt(e->e).sum();
//		int addsum = map.get("add").stream().mapToInt(e->e).sum();
//		System.out.println(evensum);
//		System.out.println(addsum);
		
//		int num =12345;
//		
//		int res=0;
//		while(num>0) {
//			int digit = num%10;
//			res= res*10+digit;
//			num/=10;
//		}
//		
//		System.out.println(res);
		
		
		
		
		
//		int[] arr = {1,2,3,4,5,6};
//		Map<String,List<Integer>> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e%2==0?"Even":"Add"));
//		int evensum = map.get("Even").stream().mapToInt(e->e).sum();
//		System.out.println(evensum);
		
//		int num =10;
//		int first =0,second = 1;
//		int thread =0;
//		for(int i=0;i<=num;i++) {
//			System.out.println(thread);
//			thread = first+second;
//			first = second;
//			second = thread;
		int num = 5;
		int fact =1;
		for(int i=1;i<=num;i++) {
			fact *=i;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
