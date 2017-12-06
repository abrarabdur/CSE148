package p6;

public class Utility implements GPAInterface {

	@Override
	public double calculateGPA(Grade[] grades, CourseBag courseBag) {
		Course[] courseArray = courseBag.getCourseArray();
		double gradePoints = 0;
		int totalCredits = 0;
		for(int i = 0; i < grades.length; i++) {
			for(int j = 0; j < courseArray.length; j++) {
				if(grades[i].getCourseNumber().equals(courseArray[j].getCourseNumber())) {
					gradePoints += convert2Points(grades[i].getLetterGrade()) * courseArray[j].getNumberOfCredits();
					totalCredits += courseArray[j].getNumberOfCredits();
					break;
				}
			}
		}
		return gradePoints / totalCredits;
	}
	
	public double convert2Points(String letterGrade) {
		if(letterGrade.equals("A")) {
			return 4.0;
		} else if (letterGrade.equals("B+")) {
			return 3.5;
		} else if (letterGrade.equals("B")) {
			return 3.0;
		} else if (letterGrade.equals("C+")) {
			return 2.5;
		} else if (letterGrade.equals("C")) {
			return 2.0;
		} else if (letterGrade.equals("D+")) {
			return 1.5;
		} else if (letterGrade.equals("D")) {
			return 1.0;
		} else {
			return 0.0;
		}
	}

}
