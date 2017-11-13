package model;

public class Address {
	private String streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;

	public Address(String streetNumber, String streetName, String city, String state, String zip) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

}
