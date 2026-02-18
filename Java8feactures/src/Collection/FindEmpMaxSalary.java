package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindEmpMaxSalary {

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("logesh",2000));
		emp.add(new Employee("sekar",2000));
		emp.add(new Employee("ajith",556666));
		emp.add(new Employee("mojan",4445666));
		emp.add(new Employee("sanjay",554433));
		emp.add(new Employee("santhosh",655544));
		emp.add(new Employee("subarayan",4456));
		emp.add(new Employee("pavi",23457));
		emp.add(new Employee("ravi",93773));
		emp.add(new Employee("deepivankat",20304));
		
		
		Double secmaxsalary = emp.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
				
		
		
		
		System.out.println(secmaxsalary);
		
		
		
//
//		Employee secmax = emp.stream()
//		        .distinct()
//		        .sorted((a, b) ->Double.compare(b.getSalary(), a.getSalary()))
//		        .skip(1)
//		        .findFirst()
//		        .get();
//System.out.println(secmax.getSalary());
//		double max = 0;
//		double secondmax = 0;
//
//		for (Employee li : emp) {
//		    if (li.getSalary() > max) {
//		        secondmax = max;
//		        max = li.getSalary();
//		    } 
//		    else if (li.getSalary() > secondmax ) {
//		        secondmax = li.getSalary();
//		    }
//		}
//
//		System.out.println("Second Max Salary = " + secondmax);
		
		Employee result = emp.stream().distinct().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).findFirst().get();
		System.out.println(result.getSalary());
		


	}

}
