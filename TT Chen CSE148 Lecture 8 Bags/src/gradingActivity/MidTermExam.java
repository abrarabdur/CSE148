package gradingActivity;

public class MidTermExam extends GradingActivity {
	private int numberOfQuestions;
	private int numberOfQuestionsMissed;
	private static final int POINTS_EACH = 5;

	public MidTermExam(int numberOfQuestions, int numberOfQuestionsMissed) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
		double score = (numberOfQuestions - numberOfQuestionsMissed) * 100.0 / numberOfQuestions;
		setScore(score);
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getNumberOfQuestionsMissed() {
		return numberOfQuestionsMissed;
	}

	public void setNumberOfQuestionsMissed(int numberOfQuestionsMissed) {
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
	}

	@Override
	public String toString() {
		return "\n\tMidTermExam [numberOfQuestions=" + numberOfQuestions + ", numberOfQuestionsMissed="
				+ numberOfQuestionsMissed + "]";
	}

}
