package gradingActivity;

public class Final extends GradingActivity{
	private int numberOfQuestions;
	private int numberOfQuestionsMissed;
	private double grammar;
	private double spelling;
	private double length;
	private double content;
	
	final double MID_TERM_WEIGHT = 0.4;
	final double FINAL_EXAM_WEIGHT = 0.6;
	
	public Final(int numberOfQuestions, int numberOfQuestionsMissed, double grammar, double spelling, double length,
			double content) {
		super();
		this.numberOfQuestions = numberOfQuestions;
		this.numberOfQuestionsMissed = numberOfQuestionsMissed;
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;
		double midTermScore = 
				new MidTermExam(numberOfQuestions, numberOfQuestionsMissed).getScore();
		double finalExamScore =
				new FinalExam(grammar, spelling, length, content).getScore();
		setScore(midTermScore * MID_TERM_WEIGHT + finalExamScore * FINAL_EXAM_WEIGHT);
	}
	
}
