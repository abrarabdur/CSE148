package model;

public class Faculty extends Person {
	private String title;

	public Faculty(String name, String title) {
		super(name);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Faculty [Name=" + getName() + ", ID=" + getId() + 
				", Phone=" + getPhone() + ", Title="
				+ title + "]";
	}
	
	
}
