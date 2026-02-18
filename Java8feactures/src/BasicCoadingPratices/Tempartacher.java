package BasicCoadingPratices;

import java.util.Scanner;
import java.util.function.Function;

public class Tempartacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value ");
//		Double celies = sc.nextDouble();
//		
//		
//		Function<Double, Double> istemparacher= temp->(temp*9/5)+32;
//		Double result = istemparacher.apply(celies);
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		Double num= sc.nextDouble();
		
		Function<Double, Double> istempacher= temp ->(temp*9/5)+32;
		Double value = istempacher.apply(num);
		System.out.println(num  );

		System.out.println(value);

	}

}
