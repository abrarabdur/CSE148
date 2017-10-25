
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
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public char getMiddleInitial() {
	return middleInitial;
}
public void setMiddleInitial(char middleInitial) {
	this.middleInitial = middleInitial;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
public String toString() {
	return "Name [firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName + "]";
}


}
