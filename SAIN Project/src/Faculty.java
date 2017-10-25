
public class Faculty extends Person {
	private double salary;

	public Faculty(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Faculty(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary;
	}
	

}
