package gradingActivity;

public class FinalExam extends GradingActivity {
	private double grammar;
	private double spelling;
	private double length;
	private double content;

	private final double GRAMMAR_WEIGHT = 0.3;
	private final double SPELLING_WEIGHT = 0.2;
	private final double LENGTH_WEIGHT = 0.2;
	private final double CONTENT_WEIGHT = 0.3;

	public FinalExam(double grammar, double spelling, double length, double content) {
		super();
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;
		double score = grammar * GRAMMAR_WEIGHT + spelling * SPELLING_WEIGHT +
						length * LENGTH_WEIGHT + content * CONTENT_WEIGHT;
		setScore(score);
	}

}
