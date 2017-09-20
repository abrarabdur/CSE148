package college;

public class Course {
	private String title;
	private String number;
	private Faculty faculty;
	private Textbook textbook;
	private Student[] student;
	private Classroom classroom;

	public Course(String title, String number) {
		this.title = title;
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty instructor) {
		this.faculty = instructor;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}
	
	

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", number=" + number + "]";
	}

}
