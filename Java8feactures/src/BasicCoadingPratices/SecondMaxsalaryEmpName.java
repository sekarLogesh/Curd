package BasicCoadingPratices;

import java.util.ArrayList;
import java.util.List;

public class SecondMaxsalaryEmpName {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee( 1,"logesh",2000000));
		list.add(new Employee( 2,"ajith",3000000));
		list.add(new Employee( 3,"pavin",5000000));
		list.add(new Employee( 4,"deepi",8000000));
		
		Employee e = list.stream().distinct().sorted((a,b)->Double.compare(b.getSalary(), a.getSalary())
				).skip(1).findFirst().get();
		System.out.println(e.getName()+"    Secmaxsalary name");
		double max=0;
		double sec=0;
		String name ="";
		String Snames ="";

		for(Employee li :list) {
			
			if(li.getSalary()>max) {
				sec=max;
				Snames=name;
				max=li.getSalary();
				
				name= li.getName();
				
			}
			else if(li.getSalary()>sec){
				
				sec=li.getSalary();
				Snames=li.getName();
				
				
				
				
			}
			
			
		}
		System.out.println(Snames);
		System.out.println(sec);

	}

}
