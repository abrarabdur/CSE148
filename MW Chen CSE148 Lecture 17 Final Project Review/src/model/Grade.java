package model;

public class Grade {
	private String course;
	private String letterGrade;

	public Grade(String course, String letterGrade) {
		super();
		this.course = course;
		this.letterGrade = letterGrade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	
}
