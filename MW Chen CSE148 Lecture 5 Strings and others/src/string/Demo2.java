package string;
public class Demo2 {

	public static void main(String[] args) {
		// .equals does not compare contents of objects other than String
		Textbook book1 = new Textbook("Java", 100.00);
		Textbook book2 = new Textbook("Java", 100.00);
		System.out.println(book1.equals(book2)); // false
	}

}
