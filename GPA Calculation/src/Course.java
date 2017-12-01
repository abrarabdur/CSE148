
public class Course {
	private String courseNumber;
	private String courseName;
	private int numberOfCredits;

	public Course(String courseNumber, String courseName, int numberOfCredits) {
		super();
		this.courseNumber = courseNumber;
		this.courseName = courseName;
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

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseName=" + courseName + ", numberOfCredits="
				+ numberOfCredits + "]";
	}

	
}
