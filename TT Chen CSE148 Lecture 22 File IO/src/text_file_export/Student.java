package text_file_export;

public class Student {
private String firstName;
private String lastName;
private String major;
private String gpa;
public Student(String firstName, String lastName, String major, String gpa) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.major = major;
	this.gpa = gpa;
}
@Override
public String toString() {
	return firstName + ", " + lastName + ", " + major + ", " + gpa;
}


}
