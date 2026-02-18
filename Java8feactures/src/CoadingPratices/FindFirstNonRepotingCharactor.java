package CoadingPratices;

import java.util.Arrays;
import java.util.List;

public class FindFirstNonRepotingCharactor {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,8,65,42);
		list.parallelStream()
	    .filter(n -> n % 2 == 0)
	    .forEach(n->System.out.println(n+" "+Thread.currentThread().getName()));
		
		
		
		
		
		
//		list.stream()
//	    .filter(n -> n % 2 == 0)
//	    .forEach(System.out::println);


		
//		  Map<String,Integer>weathermap= new HashMap<>();
//	       weathermap.put("chennai",20);
//	       weathermap.put("vandavasi",101);
//	       weathermap.put("eramalur",10);
//	       weathermap.put("madurai",21);
//	       
//	       Scanner sc = new Scanner(System.in);
//	       System.out.println("Enter city");
//	       String city = sc.nextLine();
//	       
//	       if(weathermap.containsKey(city)){
//	           int temp = weathermap.get(city);
//	           System.out.println("city"+city+temp);
//	       }
//	       else{
//	           System.out.println("city"+city+"is not avalable in weather");
//	       }

			}

}
