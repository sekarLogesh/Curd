package Exp_Coading;

public class Emp {
	
	private Long id;
	private String name;
	private Double salary;
	public Emp(int i, String string, double d) {
	    this.id = (long) i;       // int → Long
	    this.name = string;
	    this.salary = d;           // double → Double autobox
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	    return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
