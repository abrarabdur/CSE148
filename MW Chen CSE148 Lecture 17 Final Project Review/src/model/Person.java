package model;

public abstract class Person {
	private Name name;
	private String id;
	private Address address;
	private String phone;
	
	private static int idCounter = 0;

	public Person(Name name) {
		super();
		this.name = name;
		setId();
	}
	
	public Person(String firstName, char middleInitial, String lastName) {
		super();
		this.name = name;
		setId();
	}
	
	public Person(String firstName, String lastName) {
		super();
		this.name = new Name(firstName, lastName);
		setId();
	}
	
	private void setId() {
		id = String.valueOf(idCounter++);
	}

}
