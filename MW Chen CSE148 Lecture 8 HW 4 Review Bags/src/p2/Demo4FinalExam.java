package p2;

public class Demo4FinalExam {

	public static void main(String[] args) {
		Grades grades1 = new Grades(20, 3, 100, 0, 0, 100);
		FinalExam finalExam1 = grades1.getFinalExam();
		FinalExam finalExam2 = grades1.getFinalExam();
		System.out.println(finalExam1.equals(finalExam2));
		System.out.println("FinalExam1 is: " + finalExam1.getScore());
		
		FinalExam finalExam3 = grades1.getFinalExamDeep();
		System.out.println("FinalExam3 is: " + finalExam3.getScore());
		
		
		finalExam2.setScore(100); // change the score for the first object
		System.out.println("FinalExam1 is: " + finalExam1.getScore());
		System.out.println("FinalExam2 is: " + finalExam2.getScore());
		
		
		System.out.println("FinalExam3 remains: " + finalExam3.getScore());
		
//		
	}

}
