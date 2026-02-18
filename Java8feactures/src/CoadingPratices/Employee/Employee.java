package CoadingPratices.Employee;

public class Employee {


	private String  name;
	private Double  salary;
	public Employee(String name, int i) {
		super();
		this.name = name;
		this.salary = (double) i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
