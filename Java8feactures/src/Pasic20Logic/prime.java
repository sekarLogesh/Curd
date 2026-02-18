package Pasic20Logic;

public class prime {
	
	public static void main(String[] args) {
		int num =5;
		
		for(int i=2;i<num;i++) {
			if(i%2==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}

}
