package Pasic20Logic;

public class Ams {

	public static void main(String[] args) {

		int num =153;
		int ams =0;
		while(num>0) {
			int digit = num%10;
			ams = ams+(digit*digit*digit);
			num/=10;
		}
	System.out.println(ams);
	}

}
