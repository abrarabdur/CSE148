package gradingActivity;

public class Demo4BodyBag {

	public static void main(String[] args) {
		Student s1 = new Student("Johnny", 20, 0, 100, 100, 100, 100);
		Student s2 = new Student("Suzy", 20, 1, 100, 100, 100, 100);
		Student s3 = new Student("Joey", 20, 10, 100, 100, 100, 100);
		BodyBag theBag = new BodyBag(3);
		theBag.insert(s1);
		theBag.insert(s2);
		theBag.insert(s3);
		theBag.display();
//		System.out.println("-------Remove Suzy-------");
//		theBag.removeByName("Suzy");
//		theBag.display();
		Student[] a = theBag.findPersonsWithHighestLetterGrade();
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		}

}
