package emp;

abstract public class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee() {};
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	abstract public double tax();
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
}
