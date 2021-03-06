package p2;

import java.util.Scanner;

public class Student {
	private String name;
	private double gpa;
	
	private final double MIN_GPA = 0.0;
	private final double MAX_GPA = 4.0;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		checkGPA(gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		checkGPA(gpa);
	}

	private void checkGPA(double gpa) {
		if (gpa < MIN_GPA) {
			try {
				throw new InvalidGPAException("GPA entered is too small. You will be prompted for a new GPA!");
			} catch (InvalidGPAException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				checkGPA(getNewGPA());
			}
//			this.gpa = MIN_GPA;
		} else if (gpa > MAX_GPA) {
			try {
				throw new InvalidGPAException("GPA entered is too big. You will be prompted for a new GPA!");
			} catch (InvalidGPAException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				checkGPA(getNewGPA());
			}
//			this.gpa = MIN_GPA;
		} else {
			this.gpa = gpa;
		}

	}
	
	private double getNewGPA(){
		double tempGPA = MIN_GPA;
		Scanner kb = new Scanner(System.in);
		System.out.println("Re-Enter a GPA: ");
		tempGPA = kb.nextDouble();
		return tempGPA;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
