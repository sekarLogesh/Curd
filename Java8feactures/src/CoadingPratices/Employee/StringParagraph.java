package CoadingPratices.Employee;

public class StringParagraph {

	public static void main(String[] args) {
		int max=0;
String name ="This is a simple dummy paragraph created to test text formatting, readability, and layout structure in applications and documents";
String[] str = name.split(" ");

for(String st :str) {
	int count =0;
	for(char ch :st.toCharArray()) {
		count=count+1;
	}
	System.out.println(st+" = "+count);
	
	if(count>max) {
		max=count;
		
	}
	System.out.println(max);
}
	}

}
