package model;

public class Student extends Person {
	
	private double gpa;
	private Grade[] coursesTook;
	private Grade[] coursesTaking;
	private Grade[] coursesToTake;
	private Major major; // Enumerator
	
//	private CourseBag courseBag;
	
	public Student(Name name) {
		super(name);
	}
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	
	private void setGPA(CourseBag courseBag) {
		this.gpa = computeGPA(courseBag);
	}
	
	private double computeGPA(CourseBag courseBag) {
		int creditsTook = getCreditsTook(courseBag);
		double gradePoints = getGradePoints(courseBag);
		return gradePoints / creditsTook;
	}
	
	private double getGradePoints(CourseBag courseBag) {
		double gradePoints = 0.0;
		Course[] courseArray = courseBag.getCourseArray();
		for(int i = 0; i < coursesTook.length; i++) {
			for(int j = 0; j < courseArray.length; j++) {
				if(coursesTook[i].getCourse().equals(courseArray[j].getCourseNumber())) {
					gradePoints += convertLetterGrade(coursesTook[i].getLetterGrade()) 
							* courseArray[j].getNumberOfCredits();
					break;
				}
			}
		}
		return gradePoints;
	}
	
	private double convertLetterGrade(String letterGrade) {
		if(letterGrade.equals("A")) {
			return 4.0;
		} else if(letterGrade.equals("B+")) {
			return 3.5;
		} else if(letterGrade.equals("B")) {
			return 3.0;
		} else if(letterGrade.equals("C+")) {
			return 2.5;
		} else if(letterGrade.equals("C")) {
			return 2.0;
		}  else if(letterGrade.equals("D+")) {
			return 1.5;
		}  else if(letterGrade.equals("D")) {
			return 1.0;
		}  else {
			return 0;
		}
	}
	
	private int getCreditsTook(CourseBag courseBag) {
		int creditsTook = 0;
		Course[] coursesArray = courseBag.getCourseArray();
		for(int i = 0; i < coursesTook.length; i++) {
			for(int j = 0; j < coursesArray.length; j++) {
				if(coursesTook[i].getCourse().equals(coursesArray[j].getCourseNumber())) {
					creditsTook += coursesArray[j].getNumberOfCredits();
					break;
				}
			}
		}
		return creditsTook;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	
}
