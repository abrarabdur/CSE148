package p2;

public class Calculator implements IntCalculator {

	@Override
	public int calculate(int number) {
		return number * number;
	}

}
