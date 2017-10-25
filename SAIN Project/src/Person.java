
public class Person {
	private Name name;
	private String id;
	private Address address;
	
	private static int idCounter = 0;
	
	public Person(String firstName, String lastName) {
		super();
		this.name = new Name(firstName, lastName);
		this.id = String.valueOf(idCounter++);
	}
	public Person(String firstName, char middleInitial, String lastName) {
		super();
		this.name = new Name(firstName, middleInitial, lastName);
		this.id = String.valueOf(idCounter++);
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	

}
