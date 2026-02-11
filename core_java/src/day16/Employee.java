package day16;

public class Employee {
	
	String name;
	
	String gender;
	
	int emId;
	
	double salary;

	public Employee(String name, String gender, int emId, double salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.emId = emId;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", emId=" + emId + ", salary=" + salary + "]";
	}
	

	
	
	
	

}
