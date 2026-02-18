package CoadingPratices;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,2,3,4,5);
		int first = list.stream().findFirst().get();
		System.out.println(first);
	}

}
