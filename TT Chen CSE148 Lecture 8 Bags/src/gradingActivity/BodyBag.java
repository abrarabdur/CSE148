package gradingActivity;

import java.util.ArrayList;

public class BodyBag {
	private Student[] sArray;
	private int nElems;
	
	public BodyBag(int maxSize) {
		super();
		this.sArray = new Student[maxSize];
		this.nElems = 0;
	}
	
	public Student[] findPersonsWithHighestLetterGrade() {
		char highestLetterGrade = findHighestLetterGrade();
		ArrayList<Student> list = new ArrayList<>();
		for(int i = 0; i < nElems; i++) {
			if(sArray[i].getGrades().getLetterGrade()==highestLetterGrade) {
				list.add(sArray[i]);
			}
		}
		return list.toArray(new Student[list.size()]);
	}
	
	public char findHighestLetterGrade() {
		char highestLetterGrade = sArray[0].getGrades().getLetterGrade();
		for(int i = 1; i < nElems; i++) {
			if(sArray[i].getGrades().getLetterGrade() < highestLetterGrade) {
				highestLetterGrade = sArray[i].getGrades().getLetterGrade();
			}
		}
		return highestLetterGrade;
	}
	
	public Student removeByName(String name) {
		int indexFound;
		for(indexFound = 0; indexFound < nElems; indexFound++) {
			if(sArray[indexFound].getName().equals(name)){
				break;
			}
		}
		if(indexFound == nElems) {
			return null;
		} else {
			Student temp = sArray[indexFound];
			for(int i = indexFound; i < nElems-1; i++) {
				sArray[i] = sArray[i + 1];
			}
			nElems--;
			return temp;
		}
	}
	
	public Student findByName(String name) {
		for(int i = 0; i < nElems; i++) {
			if(sArray[i].getName().equals(name)) {
				return sArray[i];
			}
		}
		return null;
	}
	
	public void insert(Student aStudent) {
		sArray[nElems++] = aStudent;
	}

	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println();
	}
	 
}
