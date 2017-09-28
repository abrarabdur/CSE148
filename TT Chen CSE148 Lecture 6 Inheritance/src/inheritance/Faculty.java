package inheritance;

import sample1.Name;

// child class or subclass
public class Faculty extends Person {

	private String rank;
	private double salary;

	public Faculty(String fName, char mInitial, String lName) {
		super(fName, mInitial, lName);
		rank = "Professor";
	}

	public Faculty(String fName, String lName) {
		super(fName, lName);
		rank = "Professor";
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}


	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + super.getName() + ", rank=" + rank + ", id=" + super.getId() + ", salary=" + salary + "]";
	}

}
