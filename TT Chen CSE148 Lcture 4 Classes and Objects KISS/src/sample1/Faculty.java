package sample1;

public class Faculty {
	private String name;
	private String rank;
	private String id;
	private double salary;

	public Faculty(String name, String rank, String id, double sa) {
		super();
		this.name = name;
		this.rank = rank;
		this.id = id;
		this.salary = sa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
