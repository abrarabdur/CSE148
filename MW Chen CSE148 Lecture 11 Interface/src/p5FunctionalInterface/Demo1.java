package p5FunctionalInterface;

public class Demo1 {

	public static void main(String[] args) {
		// lambda expression
		IntCalculator multiply = (x, y) -> x * y;
		IntCalculator add = (x, y) -> x + y;
		IntCalculator subtract = (x, y) -> x - y;
		
		IntCalculator divide = (x, y) -> {
			int z = x / y;
			return z;
			};
		
		System.out.println(add.calculate(5, 2));
		System.out.println(subtract.calculate(5, 2));
		System.out.println(multiply.calculate(5, 2));
		System.out.println(divide.calculate(5, 2));
		
		System.out.println(add.twiceBig(5));
		System.out.println(subtract.twiceBig(5));
		System.out.println(subtract.square(5));
	}

}
