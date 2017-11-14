package model;

import java.io.Serializable;

public class Student extends Person implements Serializable {
	private double gpa;
	private Grade[] coursesTook;
	private Grade[] coursesTaking;
	private Grade[] coursesToTake;
	private Major major;

	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Student(String firstName, char middleInitial, String lastName) {
		super(firstName, middleInitial, lastName);
	}

	public void setGPA(CourseBag courseBag) {
		Course[] courseArray = courseBag.getCourseArray();
		double gradePoints = getGradePoints(courseArray);
		int creditsTook = getCreditsTook(courseArray);
		this.gpa = gradePoints / creditsTook;
	}
	
	private int getCreditsTook(Course[] courseArray) {
		int creditsTook = 0;
		for(int i = 0; i < coursesTook.length; i++) {
			for(int j = 0; j < courseArray.length; j++) {
				if(coursesTook[i].getCourseNumber().equals(courseArray[j].getCourseNumber())) {
					creditsTook += courseArray[j].getNumberOfCredits();
					break;
				}
			}
		}
		return creditsTook;
	}
	
	private double getGradePoints(Course[] courseArray) {
		double gradePoints = 0.0;
		for(int i = 0; i < coursesTook.length; i++) {
			for(int j = 0; j < courseArray.length; j++) {
				if(coursesTook[i].getCourseNumber().equals(courseArray[j].getCourseNumber())) {
					gradePoints += letterGradeConverter(coursesTook[i].getLetterGrade()) * courseArray[j].getNumberOfCredits();
					break;
				}
			}
		}
		return gradePoints;
	}

	private double letterGradeConverter(String letterGrade) {
		if(letterGrade.equals("A")) {
			return 4.0;
		} else if( letterGrade.equals("B+")) {
			return 3.5;
		}else if( letterGrade.equals("B")) {
			return 3.0;
		} else if( letterGrade.equals("C+")) {
			return 2.5;
		}else if( letterGrade.equals("C")) {
			return 2.0;
		}else if( letterGrade.equals("D+")) {
			return 1.5;
		}else if( letterGrade.equals("D")) {
			return 1.0;
		} else {
			return 0.0;
		}
	}
}
