package p3Andp4;

public abstract class Person {
	private String name;
	private String id;

	private static int idCounter = 0;

	public Person(String name) {
		super();
		this.name = name;
		id = String.valueOf(idCounter++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id;
	}

}
