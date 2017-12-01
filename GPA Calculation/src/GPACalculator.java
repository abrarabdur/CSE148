
public class GPACalculator {

	public double calculateGPA(Grade[] grades, CourseBag courseBag) {
		double gradePoints = 0.0;
		int totalCredits = 0;
		Course[] courseArray = courseBag.getCourseArray();

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < courseArray.length; j++) {
				if (grades[i].getCourseNumber().equals(courseArray[j].getCourseNumber())) {
					gradePoints += gradeConverter(grades[i].getLetterGrade()) * courseArray[j].getNumberOfCredits();
					totalCredits += courseArray[j].getNumberOfCredits();
				}
			}
		}

		return gradePoints / totalCredits;

	}

	public double gradeConverter(String letterGrade) {
		if (letterGrade.equalsIgnoreCase("A")) {
			return 4.0;
		} else if (letterGrade.equalsIgnoreCase("B+")) {
			return 3.5;
		} else if (letterGrade.equalsIgnoreCase("B")) {
			return 3.0;
		} else if (letterGrade.equalsIgnoreCase("C+")) {
			return 2.5;
		} else if (letterGrade.equalsIgnoreCase("C")) {
			return 2.0;
		} else if (letterGrade.equalsIgnoreCase("D+")) {
			return 1.5;
		} else if (letterGrade.equalsIgnoreCase("D")) {
			return 1.0;
		} else {
			return 0.0;
		}

	}
}
