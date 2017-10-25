
public class CreditsAndGPACalculator {
	
	public static int getCredits(Grade[] courses,Course[] masterCourseArray) {
		int totalCredits = 0;
		for(int i = 0; i < courses.length; i++) {
			for(int j = 0; j < masterCourseArray.length; j++) {
				if(courses[i].getCourseNumber().equals(masterCourseArray[j].getCourseNumber())) {
					totalCredits += masterCourseArray[j].getCredits();
				}
			}
		}
		return totalCredits;
	}
	
//	public static double getGPA(Grade[] courses, Course[] masterCourseArray) {
//		
//	}

}