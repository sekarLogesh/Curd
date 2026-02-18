package CoadingPratices.Employee;

public class StringArray {

	public static void main(String[] args) {

		String name = "education";
		char[] str = new char[name.length()];
		int index=0;
		for(char ch:name.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				str[index++] = ch;
				
			}
		}
		for(char ch:name.toCharArray()) {
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				str[index++] = ch;
				
			}
	}
		
		for(char st:str) {
			System.out.print(st);
		}
		}

}
