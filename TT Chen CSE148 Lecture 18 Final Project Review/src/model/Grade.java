package model;

public class Grade {
	private String courseNumber;
	private String letterGrade;

	public Grade(String courseName, String letterGrade) {
		super();
		this.courseNumber = courseName;
		this.letterGrade = letterGrade;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseName) {
		this.courseNumber = courseName;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

}
