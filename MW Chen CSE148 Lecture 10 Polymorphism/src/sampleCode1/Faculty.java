package sampleCode1;

import college.Name;

public class Faculty extends Person {

	private double salary;

	public Faculty(Name name) {
		super(name);
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

	@Override
	public void display() {
		System.out.println("Name: " + getName() + ", Salary:" + salary);
	}

}
