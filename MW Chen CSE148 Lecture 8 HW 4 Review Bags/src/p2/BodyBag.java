package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BodyBag {
	private Student[] sArray;
	private int nElems;

	public BodyBag(int maxSize) {
		super();
		this.sArray = new Student[maxSize];
		this.nElems = 0;

	}
	
	public void importTextFile(String fileName) {
		File file = new File(fileName);
		try {
			Scanner in = new Scanner(file);
			while(in.hasNextLine()) {
				String[] tokens = in.nextLine().split(" ");
				Name name;
				if(tokens.length == 2) {
					name = new Name(tokens[0], tokens[1]);
				} else {
					name = new Name(tokens[0], tokens[1], tokens[2]);
				}
				Name name = new Name(tokens[0], tokens[1]);
				Student s = new Student(name, address, phone, major);
				insert(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Student removeByName(String name) {
		int indexFound;
		for (indexFound = 0; indexFound < nElems; indexFound++) {
			if (sArray[indexFound].getName().equals(name)) {
				break;
			}
		}
		if (indexFound == nElems) {
			return null;
		} else {
			Student temp = sArray[indexFound];
			for (int j = indexFound; j < nElems; j++) {
				sArray[j] = sArray[j + 1];
			}
			nElems--;
			return temp;
		}
	}

	public Student findPersonHighestLetterGrade() {
		char highestLetter = sArray[0].getGrades().getLetterGrade();
		int highestIndex = 0;
		for (int j = 1; j < nElems; j++) {
			if (sArray[j].getGrades().getLetterGrade() < highestLetter) {
				highestLetter = sArray[j].getGrades().getLetterGrade();
				highestIndex = j;
			}
		}
		return sArray[highestIndex];
	}
	
	private char findHighestLetterGrade() {
		char highestLetter = sArray[0].getGrades().getLetterGrade();
		int highestIndex = 0;
		for (int j = 1; j < nElems; j++) {
			if (sArray[j].getGrades().getLetterGrade() < highestLetter) {
				highestLetter = sArray[j].getGrades().getLetterGrade();
				highestIndex = j;
			}
		}
		return sArray[highestIndex].getGrades().getLetterGrade();
	}
	
	public Student[] findPersonsHighestLetterGrade() {
		char highestLetterGrade = findHighestLetterGrade();
		ArrayList<Student> highestList = new ArrayList<>();
		for(int i = 0; i < nElems; i++) {
			if(sArray[i].getGrades().getLetterGrade() == highestLetterGrade) {
				highestList.add(sArray[i]);
			}
		}
		return highestList.toArray(new Student[highestList.size()]);
	}
	

	public void insert(Student student) {
		sArray[nElems++] = student;
	}

	public void insert(String name, int numberOfQuestions, int numberOfQuestionsMissed, double grammar, double spelling,
			double length, double content) {
		sArray[nElems++] = new Student(name, numberOfQuestions, numberOfQuestionsMissed, grammar, spelling, length,
				content);
	}

	public Student findByName(String name) {
		for (int i = 0; i < nElems; i++) {
			if (sArray[i].getName().equals(name)) {
				return sArray[i];
			}
		}
		return null;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println();
	}

}
