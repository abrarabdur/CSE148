package p2;

public class Demo {

	public static void main(String[] args) {
		int numberOfQuestions = 20;
		int numberOfQuestionsMissed = 3;
		double grammarScore = 100;
		double spellingScore = 0;
		double lengthScore = 0;
		double contentScore = 100;
		
		final double MIDTERM_WEIGHT = 0.4;
		final double FINAL_WEIGHT = 0.6;
		
		MidTermExam midTermExam = new MidTermExam(numberOfQuestions, numberOfQuestionsMissed);
		double midTermScore = midTermExam.getScore();
		FinalExam finalExam = new FinalExam(grammarScore, spellingScore, lengthScore, contentScore);
		double finalScore = finalExam.getScore();
		
		double totalScore = midTermScore * MIDTERM_WEIGHT + finalScore * FINAL_WEIGHT;
		
		GradeActivity gradeActivity = new GradeActivity(totalScore);
		System.out.println(gradeActivity.getLetterGrade());
		
	}

}
