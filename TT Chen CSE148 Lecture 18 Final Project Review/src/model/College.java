package model;

public class College {
	private PersonBag personBag;
	private CourseBag courseBag;
	private ClassroomBag classroomBag;
	private TextbookBag textbookBag;

	public College(PersonBag personBag, CourseBag courseBag, ClassroomBag classroomBag, TextbookBag textbookBag) {
		super();
		this.personBag = personBag;
		this.courseBag = courseBag;
		this.classroomBag = classroomBag;
		this.textbookBag = textbookBag;
	}

}
