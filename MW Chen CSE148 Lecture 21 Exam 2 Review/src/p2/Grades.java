package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Grades implements Serializable {
	private Grade[] grades;
	private int nElems;
	private transient Scanner in;

	public Grades(int maxSize) {
		grades = new Grade[maxSize];
		nElems = 0;
	}

	public void save() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output/grades.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(grades);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void importData1() {
		in = new Scanner(System.in);
		System.out.println("How many grades to import? ");
		int numberOfGrades = in.nextInt();
		in.nextLine();
		for (int i = 0; i < numberOfGrades; i++) {
			System.out.println("Enter course number: ");
			String courseNumber = in.nextLine();
			System.out.println("Enter the letter grade: ");
			String letterGrade = in.nextLine();
			Grade grade = new Grade(courseNumber, letterGrade);
			System.out.println("Enter course number and letter grade, separated by a comma: ");
			// String[] tokens = in.nextLine().split(", ");
			insert(grade);
		}
	}

	public void importData2() {
		File file = new File("grades.txt");
		try {
			in = new Scanner(file);
			while (in.hasNextLine()) {
				String[] tokens = in.nextLine().split(", ");
				Grade grade = new Grade(tokens[0], tokens[1]);
				insert(grade);
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insert(Grade grade) {
		grades[nElems++] = grade;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(grades[i]);
		}
		System.out.println();

		// for(Grade grade : grades) {
		// System.out.println(grade);
		// }
	}

}
