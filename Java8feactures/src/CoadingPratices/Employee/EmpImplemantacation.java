package CoadingPratices.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpImplemantacation {
	public static void main(String[] args) {
		
		 List<Employee> employees = Arrays.asList(
	                new Employee("Ram", 25000),
	                new Employee("Anu", 30000),
	                new Employee("Karthik", 20000),
	                new Employee("Veer", 40000)
	                
	                
	        );
		 
		 
		 Employee secondmaxsalary = employees.stream().distinct().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())).skip(1).findFirst().orElse(null);
		 System.out.println(secondmaxsalary);
		 
//		 List<Employee> sortedList = employees.stream()
//	                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) 
//	                .collect(Collectors.toList());

		 List<Employee> finalresult = employees.stream().sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());
		 
		 finalresult.forEach(System.out::println);
		
	}

}
