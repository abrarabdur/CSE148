package p6;

public class Demo {

	public static void main(String[] args) {
		Grades grades = new Grades(10);
		grades.importData2();
		grades.display();
		
		CourseBag courseBag = new CourseBag(20);
		courseBag.importData();
		courseBag.display();
//		double gpa = new Utility().calculateGPA(grades.getGrades(), courseBag);
		Grade[] gradeArray = grades.getGrades();
		GPAInterface gpaInterface = 
			(a, b) -> {
				Course[] courseArray = b.getCourseArray();
				double gradePoints = 0;
				int totalCredits = 0;
				for(int i = 0; i < a.length; i++) {
					for(int j = 0; j < courseArray.length; j++) {
						if(a[i].getCourseNumber().equals(courseArray[j].getCourseNumber())) {
							gradePoints += convert2Points(a[i].getLetterGrade()) * courseArray[j].getNumberOfCredits();
							totalCredits += courseArray[j].getNumberOfCredits();
							break;
						}
					}
				}
				return gradePoints / totalCredits;
			
		
		};
		
		System.out.printf("The GPA is: %.2f", gpaInterface.calculateGPA(gradeArray, courseBag));
	}
	
	public static double convert2Points(String letterGrade) {
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
