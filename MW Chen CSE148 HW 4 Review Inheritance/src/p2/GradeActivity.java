package p2;
/*
 * Polymorphism:
 * A superclass type of reference variable can reference
 * any of its subclass's objects
 */
public class GradeActivity {
	private double score;
	private char letterGrade;

	// Overloaded constructors
	public GradeActivity(double score) {
		super();
		this.score = score;
	}

	public GradeActivity() {
		super();
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public char getLetterGrade() {
		return calculateLetterGrade();
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	private char calculateLetterGrade() {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

}
