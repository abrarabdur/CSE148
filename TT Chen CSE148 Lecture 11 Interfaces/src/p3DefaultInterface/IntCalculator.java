package p3DefaultInterface;

public interface IntCalculator {
	default int add(int number1, int number2) {
		return number1 + number2;
	}

	default int subtract(int number1, int number2) {
		return number1 - number2;
	}

	default int multiply(int number1, int number2) {
		return number1 * number2;
	}

	default int divide(int number1, int number2) {
		return number1 / number2;
	}

}
