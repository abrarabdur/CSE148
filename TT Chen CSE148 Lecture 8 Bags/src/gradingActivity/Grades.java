package gradingActivity;

public class Grades extends GradingActivity{
	private MidTermExam midTermExam;
	private FinalExam finalExam;
	
	final double MID_TERM_WEIGHT = 0.4;
	final double FINAL_EXAM_WEIGHT = 0.6;
	
	public Grades(int numberOfQuestions, int numberOfQuestionsMissed, double grammar, double spelling, double length,
			double content) {
		super();
		midTermExam = new MidTermExam(numberOfQuestions, numberOfQuestionsMissed);
		finalExam = new FinalExam(grammar, spelling, length, content);
		setScore(midTermExam.getScore() * MID_TERM_WEIGHT + finalExam.getScore() * FINAL_EXAM_WEIGHT);
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
		return String.valueOf(midTermExam) + String.valueOf(finalExam);
	}
	
	
}
