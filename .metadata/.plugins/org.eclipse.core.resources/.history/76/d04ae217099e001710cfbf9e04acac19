package college;

public class Instructor {
	private Name name;
	private int id;
	private double salary;

	private static int idCounter = 0;

	public Instructor(String firstName, String lastName) {
		id = ++idCounter;
		this.name = new Name(firstName, lastName);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", id=" + id + "]";
	}

}
