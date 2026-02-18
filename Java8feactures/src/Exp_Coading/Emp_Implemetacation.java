package Exp_Coading;

import java.util.ArrayList;
import java.util.List;

public class Emp_Implemetacation {

	public static void main(String[] args) {
		List<Emp> em = new ArrayList<>();
		em.add(new Emp(1, "logesh", 1000));
		em.add(new Emp(2, "sekar", 2000));
		em.add(new Emp(3, "ravi", 14000));

		Emp e = em.stream()
		          .distinct()
		          .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
		          .skip(1)
		          .findFirst()
		          .orElse(null);

		System.out.println(e.getSalary());

		
	}

}
