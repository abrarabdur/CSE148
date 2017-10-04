package p2;

public class DemoFinal {

	public static void main(String[] args) {
		int numberOfQuestions = 20;
		int numberOfQuestionsMissed = 3;
		double grammarScore = 100;
		double spellingScore = 0;
		double lengthScore = 0;
		double contentScore = 100;
		
		Grades finalGrade = new Grades(numberOfQuestions, 
				numberOfQuestionsMissed, grammarScore, spellingScore, 
				lengthScore, contentScore);
		System.out.println(finalGrade.getScore());
		System.out.println(finalGrade.getLetterGrade());
	}

}
