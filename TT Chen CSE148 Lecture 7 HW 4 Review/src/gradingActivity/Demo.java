package gradingActivity;

public class Demo {

	public static void main(String[] args) {
		GradingActivity ga1 = new GradingActivity();
		MidTermExam me1 = new MidTermExam(20, 3);
		FinalExam fe1 = new FinalExam(100, 100, 100, 100);
		final double MID_TERM_WEIGHT = 0.4;
		final double FINAL_EXAM_WEIGHT = 0.6;
		double finalScore = me1.getScore() * MID_TERM_WEIGHT 
				+ fe1.getScore() * FINAL_EXAM_WEIGHT;
		GradingActivity finalGrade = new GradingActivity(finalScore);
		System.out.println(finalScore);
		System.out.println(finalGrade.getLetterGrade());
	}
}
