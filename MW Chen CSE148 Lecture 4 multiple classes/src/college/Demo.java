package college;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter classroom information (RoomNumber Capacity HasProjectorOrNot): ");
		String info = input.nextLine();
		String[] tokens = info.split(",");
		tokens[1] = tokens[1].trim();
		tokens[2] = tokens[2].trim();
		
		System.out.println(tokens[0].indexOf(' '));
		System.out.println(Arrays.toString(tokens));
	}

}
