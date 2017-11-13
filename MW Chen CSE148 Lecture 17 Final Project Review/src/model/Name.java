package model;

public class Name {
	private String firstName;
	private char middleInitial;
	private String lastName;

	public Name(String firstName, char middleInitial, String lastName) {
		super();
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
