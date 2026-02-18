package Pasic20Logic;

public class fibonicess {

	public static void main(String[] args) {
     
		int num =5;
		int firest =0;
		int second =1;
		for(int i=2;i<=num;i++) {
			int thred = firest +second;
			firest=second;
			second= thred;
			System.out.println(thred);
		}
	}

}
