package model;

public class ClassroomBag {
	
	private Classroom[] arr;
	private int nElems;
	
	public ClassroomBag (int maxSize) {
		arr = new Classroom[maxSize];
		nElems = 0;
	}
	
	public void insert(Classroom classroom) {
		arr[nElems++] = classroom;
	}
	public void save() {

	}

	public void load() {

	}

	public void importData() {

	}

	public void exportData() {

	}
}
