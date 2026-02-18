package Pasic20Logic;

public class ReverceNumber {

	public static void main(String[] args) {

		int num =123405;
		int res =0;
		while(num>0) {
			int digit = num%10;
			res = res*10+digit;
			num/=10;
		}
		System.out.println(res);
	}

}
