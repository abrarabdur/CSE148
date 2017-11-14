package model;

import java.io.Serializable;

public abstract class Person implements Serializable {
	private Name name;
	private String id;
	private Address address;
	private String phone;

	private static int idCounter = 0;

	public Person(Name name, Address address, String phone) {
		super();
		this.name = name;
		setId();
		this.address = address;
		this.phone = phone;
	}

	public Person(String firstName, char middleInitial, String lastName) {
		super();
		this.name = new Name(firstName, middleInitial, lastName);
		setId();
	}

	public Person(String firstName, String lastName) {
		super();
		this.name = new Name(firstName, lastName);
		setId();
	}

	private void setId() {
		this.id = String.valueOf(idCounter++);
	}

	public Name getName() {
		return name;
	}

	public void setName(String firstName, char middleInitial, String lastName) {
		this.name = new Name(firstName, middleInitial, lastName);
	}

	public void setName(String firstName, String lastName) {
		this.name = new Name(firstName, lastName);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(String streetNumber, String streetName, String city, String state, String zip) {
		this.address = new Address(streetNumber, streetName, city, state, zip);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}
	
	/*
	 * save the idCounter value
	 */
	public void saveIdCounter() {
		// save as a text file
	}
	
	/*
	 * load idCounter value
	 */
	public void loadIdCounter() {
		// to be completed
	}
	
}
