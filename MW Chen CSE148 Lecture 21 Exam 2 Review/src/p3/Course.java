package p3;

public class Course {
	private String courseNumber;
	private String courseDescription;
	private int numberOfCredits;

	public Course(String courseNumber, String courseDescription, int numberOfCredits) {
		super();
		this.courseNumber = courseNumber;
		this.courseDescription = courseDescription;
		this.numberOfCredits = numberOfCredits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseDescription=" + courseDescription
				+ ", numberOfCredits=" + numberOfCredits + "]";
	}

}
