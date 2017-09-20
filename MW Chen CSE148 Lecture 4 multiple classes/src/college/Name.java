package college;

public class Name {
	private String firstName;
	private char middleInital;
	private String lastName;

	// overloaded constructors
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Name(String firstName, char middleInitial, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInital = middleInitial;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMiddleInital() {
		return middleInital;
	}

	public void setMiddleInital(char middleInital) {
		this.middleInital = middleInital;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleInital=" + middleInital + ", lastName=" + lastName + "]";
	}

}
