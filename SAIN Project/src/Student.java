import java.util.Arrays;

public class Student extends Person {
	private double gpa;
	private Grade[] coursesTook;
	private Grade[] coursesTaking;
	private Grade[] coursesToTake;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Student(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}
	

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Grade[] getCoursesTook() {
		return coursesTook;
	}

	public void setCoursesTook(Grade[] coursesTook) {
		this.coursesTook = coursesTook;
	}

	public Grade[] getCoursesTaking() {
		return coursesTaking;
	}

	public void setCoursesTaking(Grade[] coursesTaking) {
		this.coursesTaking = coursesTaking;
	}

	public Grade[] getCoursesToTake() {
		return coursesToTake;
	}

	public void setCoursesToTake(Grade[] coursesToTake) {
		this.coursesToTake = coursesToTake;
	}

	@Override
	public String toString() {
		return super.toString() + ", gpa=" + gpa + ", coursesTook="
				+ Arrays.toString(coursesTook) + ", coursesTaking=" + Arrays.toString(coursesTaking)
				+ ", coursesToTake=" + Arrays.toString(coursesToTake);
	}
	
	
	

}
