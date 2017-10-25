package p3DefaultInterface;

public class Calculator implements IntCalculator{
	@Override
	public int add(int n1, int n2) {
		return n2 + n1;
	}

}
