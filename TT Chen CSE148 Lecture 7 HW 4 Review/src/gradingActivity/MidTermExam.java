package gradingActivity;

public class MidTermExam extends GradingActivity {
	private int numberOfQuestions;
	private int numberOfQuestionsMissed;
	private static final int POINTS_EACH = 5;

	public MidTermExam(int numberOfQuestions, int numberOfQuestionsMissed) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
		double score = (numberOfQuestions - numberOfQuestionsMissed) * 100.0 
				/ numberOfQuestions;
		setScore(score);
	}

}
