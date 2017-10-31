package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args)  {
		Scanner kb = new Scanner(System.in);
		Student s = new Student("John", 3.5);
		System.out.println("Enter a new GPA: ");
		double newGpa = 0.0;
		try {
			newGpa = kb.nextDouble();
			
		} catch (InputMismatchException e) {
			do {
				kb.nextLine();
				System.out.println("Incorrect GPA, Enter again: ");
				newGpa = kb.nextDouble();
			} while (newGpa< 0.0 && newGpa > 4.0);
		}
		s.setGpa(newGpa);
		System.out.println(s);
	}

}
