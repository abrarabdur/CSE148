package p4FunctionalInterface;

public class Demo {

	public static void main(String[] args) {
		// lambda expressions
		IntCalculator add = (a, b) -> a + a;
		IntCalculator subtract = (x, y) -> x - y;
		IntCalculator multiply = (a, b) -> a * a;
		IntCalculator divide = (x, y) -> x / y;
		
		System.out.println(add.calculate(5, 3));
		System.out.println(subtract.calculate(5, 3));
		System.out.println(multiply.calculate(5, 3));
		System.out.println(divide.calculate(5, 3));
	}

}
