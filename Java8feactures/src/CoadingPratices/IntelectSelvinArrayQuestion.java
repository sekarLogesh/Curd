package CoadingPratices;

import java.util.HashMap;
import java.util.Map;

public class IntelectSelvinArrayQuestion {

	public static void main(String[] args) {
		String name = "abccbacbc";
		int counts=0;
		char [] ch = name.toCharArray();
		char  visited = '0';
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=visited) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[j]==ch[i]) {
						ch[j]= visited;
						
						
					}
				}
				counts=counts+1;
				System.out.print(ch[i]);
				
			}
		}
		
		
		System.out.println();
		System.out.println(counts+"counts");


		
		
		
		
		
		
		
		
		
	}

}
