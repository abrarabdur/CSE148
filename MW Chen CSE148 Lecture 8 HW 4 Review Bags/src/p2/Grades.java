package p2;

public class Grades extends GradeActivity {
	private MidTermExam midTermExam;
	private FinalExam finalExam;

	private static final double MIDTERM_WEIGHT = 0.4;
	private static final double FINAL_WEIGHT = 0.6;

	public Grades(int numberOfQuestions, int numberOfQuestionsMissed, double grammarScore, double spellingScore,
			double lengthScore, double contentScore) {
		super();

		midTermExam = new MidTermExam(numberOfQuestions, numberOfQuestionsMissed);
		double midTermScore = midTermExam.getScore();
		finalExam = new FinalExam(grammarScore, spellingScore, lengthScore, contentScore);
		double finalScore = finalExam.getScore();
		double totalScore = midTermScore * MIDTERM_WEIGHT + finalScore * FINAL_WEIGHT;
		setScore(totalScore);
	}

	public MidTermExam getMidTermExam() {
		return midTermExam;
	}

	public void setMidTermExam(MidTermExam midTermExam) {
		this.midTermExam = midTermExam;
	}

	public FinalExam getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(FinalExam finalExam) {
		this.finalExam = finalExam;
	}

	@Override
	public String toString() {
		return midTermExam + "" + finalExam;
	}

}
