package sampleCode1;

import college.Name;

public abstract class Person {
	private Name name;
	private String id;

	private static int idCounter = 0;

	public Person(Name name) {
		super();
		id = String.valueOf(idCounter++);
		this.name = name;
	}
	
	public abstract void display();

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}

}
