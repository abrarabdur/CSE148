package p1Intro;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Adam";
		names[1] = "Bill";
		names[2] = "Charlie";
		names[4] = "Julie";
		names[9] = "Zack";
		// collectively called unchecked Exceptions
		// meaning not checked by the compiler.
		// we called them runtime exception.
		// NullPointerException
		for (int i = 0; i < names.length; i++) {
			try {
				System.out.println(names[i].length());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage() + ": NullPointerExceptionEncountered");
			}
		}

		// ArrayIndexOutOfBoundsException
		// System.out.println(names[10]);
		//
		// Scanner kb = new Scanner(System.in);
		// System.out.println("Enter a number: ");
		// double number = kb.nextDouble();
		// System.out.println(String.valueOf(number));
		//
		// Student s1 = new Student("John");

	}

}
