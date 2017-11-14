package model;

public class Course {
	private String courseNumber;
	private String courseName;
	private String courseDescription;
	private int numberOfCredits;

	public Course(String courseNumber, String courseName, String courseDescription, int numberOfCredits) {
		super();
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.numberOfCredits = numberOfCredits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

}
