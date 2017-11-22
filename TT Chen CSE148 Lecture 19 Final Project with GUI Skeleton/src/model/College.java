package model;

public class College {
	private PersonBag personBag;
	private TextbookBag textbookBag;
	

	public College(int personBagMaxSize, int textbookBagMaxSize) {
		super();
		this.personBag = new PersonBag(personBagMaxSize);
		this.textbookBag = new TextbookBag(textbookBagMaxSize);
		loadAll();
	}
	
	public void loadAll() {
		personBag.load();
		textbookBag.load();
	}
	public void saveAll() {
		personBag.save();
		textbookBag.save();
	}
}
