package sample1;

public class Faculty {
	private Name name;
	private String rank;
	private String id;
	private double salary;
	
	private static int idCounter;

	public Faculty(String fName, String lName, char mInitial) {
		this.name = new Name(fName, mInitial, lName);
		idCounter++;
		this.id = String.valueOf(idCounter);
	}
	
	public Faculty(String fName, String lName) {
		this.name = new Name(fName, lName);
		idCounter++;
		this.id = String.valueOf(idCounter);
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", rank=" + rank + ", id=" + id + ", salary=" + salary + "]";
	}

}
