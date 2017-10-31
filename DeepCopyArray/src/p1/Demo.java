package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String[] names = {"a", "b", "c"};
		String[] names2 = new String[names.length];
		for(int i = 0; i < names.length; i++) {
			names2[i] = names[i];
		}
		names[0] = "A";
		System.out.println(names2[0]);
	}

}
