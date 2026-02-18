package Pasic20Logic;

public class CheckVowelsPrest {

	public static void main(String[] args) {
     String name = "education";
     int count=0;
     char[] ch = name.toCharArray();
     for(char i=0;i<ch.length;i++) {
    	 if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') {
    		 count++;
    		 
    	 }
    	
     }
     if(count !=0) {
		 System.out.println("vowels is present ");
	 }
	 else {
		 System.out.println("vowels is not present");
	 }
	}

}
