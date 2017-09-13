package test;

public class Test {

	public static void main(String[] args) {
		int i = 1;
		int[] numbers = { 1, 2, 3, 4};
		justDoIt(i, numbers);
		System.out.println("i = " + i + "\t" + "numbers[0] = " + numbers[0]);
		numbers = null;
	}
	
	private static void justDoIt(int n, int[] nums) {
		n = 10;
		nums[0] = 100;
		System.out.println("n = " + n + "\t" + "nums[0] = " + nums[0]);
	}

}
