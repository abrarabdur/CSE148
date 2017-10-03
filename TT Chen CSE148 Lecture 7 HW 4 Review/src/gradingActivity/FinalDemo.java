package gradingActivity;

public class FinalDemo {

	public static void main(String[] args) {
		int numberOfQuestions = 20;
		int numberOfQuestionsMissed = 3;
		
		double grammar = 100;
		double spelling = 0;
		double length = 0;
		double content = 100;
		
		
		Final f1 = new Final(numberOfQuestions, numberOfQuestionsMissed, 
				grammar, spelling, length, spelling);
		System.out.println(f1.getScore());
		System.out.println(f1.getLetterGrade());
	}

}
