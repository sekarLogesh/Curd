package Pasic20Logic;

public class ReverceString {

	public static void main(String[] args) {

		
		String name = "logesh";
		String res="";
		for(int i=name.length()-1;i>=0;i--) {
			res = res+name.charAt(i);
		}
		System.out.println(res);
	}

}
