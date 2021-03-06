package p5FunctionalInterface;

public interface IntCalculator {
	int calculate(int number1, int number2);

	default int twiceBig(int number) {
		return 2 * number;
	}

	default int square(int number) {
		return number * number;
	}
}
