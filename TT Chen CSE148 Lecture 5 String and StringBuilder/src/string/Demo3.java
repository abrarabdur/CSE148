package string;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter student info \n(fn, mn,ln, id, and gpa, separated by a space): ");
		String info = kb.nextLine();
		System.out.println(info);
		String[] tokens = info.split(" ");
		
		char middleInitial = tokens[1].toUpperCase().charAt(0);
		
		int id = Integer.parseInt(tokens[3]);
		
		double gpa = Double.parseDouble(tokens[4]);
		
		
		
		
	}

}
