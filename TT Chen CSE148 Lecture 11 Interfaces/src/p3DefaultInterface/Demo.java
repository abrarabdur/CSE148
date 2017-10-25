package p3DefaultInterface;

public class Demo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.add(1, 2));
		System.out.println(c1.subtract(3, 3));
		System.out.println(c1.multiply(2, 3));
		System.out.println(c1.divide(3, 2));
	}

}
