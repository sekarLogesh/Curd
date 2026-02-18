package CoadingPratices;

import java.util.ArrayList;
import java.util.List;

public class Emp_Implements {

	public static void main(String[] args) {
		
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp (1,"logesh",200000));
		emp.add(new Emp (2,"ajith",2230000));
		emp.add(new Emp (1,"pavin",5400000));
		
		double max= 0;
		double Sec_max= 0;
		String maxname="";
		String secmaxname="";
		
		for(Emp e:emp) {
			if(e.getSalary()>max) {
				Sec_max=max;
				 max=e.getSalary();
				 
				 secmaxname=maxname;
				 maxname=e.getName();
			}
			else if(e.getSalary()>Sec_max) {
				Sec_max=e.getSalary();
				secmaxname=e.getName();
			}
		}
System.out.println(Sec_max);
System.out.println(secmaxname);


	}

}
