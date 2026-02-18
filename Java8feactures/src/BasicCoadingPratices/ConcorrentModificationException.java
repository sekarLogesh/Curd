package BasicCoadingPratices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcorrentModificationException {

	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(10, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 1);
		Iterator<Map.Entry<Integer, Integer>>it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> value = it.next();
			System.out.println(value.getKey()+" "+value.getValue());
		}


		
//		List<Integer> list = Arrays.asList(10,20,30,40);
//		for(Integer li :list) {
//			list.add(100);
//		}
//		
//		System.out.println(list);
	}

}
