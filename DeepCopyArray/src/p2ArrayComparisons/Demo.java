package p2ArrayComparisons;

public class Demo {

	public static void main(String[] args) {
		String[] coursesTook = {"CSE110", "CSE118"};
		String[] coursesTaking = {"CSE148", "MAT141"};
		String[] coursesToTake = {"CSE218", "MAT142"};
		
		Course[] masterCourseArray = new Course[100];
		masterCourseArray[0] = new Course("COL101", "College Seminar", 1);
		masterCourseArray[1] = new Course("CSE110", "CS CollegeSeminar", 1);
		masterCourseArray[2] = new Course("CSE118", "Intro to Java", 3);
		masterCourseArray[3] = new Course("CSE148", "OOP", 4);
		masterCourseArray[4] = new Course("CSE218", "Data Structures", 3);
		masterCourseArray[5] = new Course("CSE248", "Advanced Java", 3);
		masterCourseArray[6] = new Course("CSE222", "Architecture", 3);
		masterCourseArray[7] = new Course("MAT141", "Calc I", 4);
		masterCourseArray[8] = new Course("MAT142", "Calc II", 4);
		
		System.out.println("Credits took: " + getCredits(coursesTook, masterCourseArray));
		System.out.println("Credits taking: " + getCredits(coursesTaking, masterCourseArray));
		System.out.println("Credits to take: " + getCredits(coursesToTake, masterCourseArray));
	}
	
	private static int getCredits(String[] babyArray, Course[] masterArray){
		int totalCredits = 0;
		for(int i = 0; i < babyArray.length; i++) {
			for(int j = 0; j < masterArray.length; j++) {
				if(babyArray[i].equals(masterArray[j].getCourseNumber())) {
					totalCredits = totalCredits + masterArray[j].getCredits();
					break;
				}
			}
		}
		return totalCredits;
	}

}
