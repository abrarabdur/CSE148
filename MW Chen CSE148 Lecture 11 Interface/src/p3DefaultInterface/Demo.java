package p3DefaultInterface;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2, 1));
		System.out.println(c1.subtract(2, 1));
		System.out.println(c1.multiply(2, 1));
		System.out.println(c1.divide(2, 1));
	}

}
