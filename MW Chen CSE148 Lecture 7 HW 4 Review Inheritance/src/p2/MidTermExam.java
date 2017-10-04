package p2;

public class MidTermExam extends GradeActivity {
	private int numberOfQuestions;
	private int numberOfQuestionsMissed;

	private static final int POINTS_EACH = 5;

	public MidTermExam(int numberOfQuestions, int numberOfQuestionsMissed) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
		setScore((numberOfQuestions - numberOfQuestionsMissed) * 100.0 / (numberOfQuestions));
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

	public static int getPointsEach() {
		return POINTS_EACH;
	}

}
