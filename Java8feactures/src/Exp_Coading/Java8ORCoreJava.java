package Exp_Coading;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ORCoreJava {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,81,233,3,4};
		
		// print duplicate
//		Map<Integer,Long> map= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,LinkedHashMap::new ,Collectors.counting()));
//		
//		 map.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
//		
		
		// print unieqes values
		
		Map<Integer,Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e,LinkedHashMap::new ,Collectors.counting()));
		//map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).forEach(System.out::println);
	/// count
//		long count= map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).count();
//		System.out.println(count);
		
		
		
		/// print add and even single streem
		
//		Arrays.stream(arr).forEach(e->{
//			
//			if(e%2==0)
//				System.out.println("Even"+e);
//			else
//				System.out.println("odd"+e);
//			
//		});
		
		
//		int[] str = {1,2,34,0,5,6,0,77};
//		int[] str2= new int[str.length];
//		 int index=0;
//		
//		for(int i=0;i<str.length;i++) {
//			if(str[i]!=0)
//			str2[index++]=str[i]; 
//		}
//		
//		for(int i=0;i<str.length;i++) {
//			if(str[i]==0)
//			str2[index++]=str[i]; 
//		}
//		
//		
//		for(int i=0;i<str2.length;i++) {
//			System.out.println(str2[i]);
//		}
		 
		
		
		
		int a=10;
		int b = 20;
		a=a+b;
		b= a-b;
		a= a-b;
		
		
		System.out.println("A=:"+a+"  B=:"+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
