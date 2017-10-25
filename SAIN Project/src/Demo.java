
public class Demo {

	public static void main(String[] args) {
		CourseBag theBag = new CourseBag(10);
		theBag.insert(new Course("CST111", "Intro to CS", 3));
		theBag.insert(new Course("CST112", "Intro to CS", 2));
		theBag.insert(new Course("CST113", "Intro to CS", 4));
		theBag.insert(new Course("CST114", "HTML and CSS", 2));
		theBag.display();
		Grade[] coursesTook = {new Grade("CST111", "A"), new Grade("CST112", "B+"),
				new Grade("CST113", "B")};
		int credits = CreditsAndGPACalculator.getCredits(coursesTook, CourseBag.getCourseArray());
		System.out.println(credits);
		System.out.println();
		theBag.insert(new Course("CST115", "Javascript", 4));
		theBag.display();
		credits = CreditsAndGPACalculator.getCredits(coursesTook, CourseBag.getCourseArray());
		System.out.println(credits);
		System.out.println();
		
	
		
	}

}
