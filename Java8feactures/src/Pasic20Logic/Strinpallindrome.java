package Pasic20Logic;

public class Strinpallindrome {

	public static void main(String[] args) {

		String name = "madam";
		 String res=""; 
		char[] ch = name.toCharArray();
	for(char i=0;i<ch.length;i++) {
		res = res +ch[i];
		
	}
	if(res .equals(name)) {
		System.out.println("pallindrome");
	}
	else {
		System.out.println("not pallindrome");
	}
	}

}
