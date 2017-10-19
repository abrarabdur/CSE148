package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String[] symbol= new String[2];
		String[] name= new String[2];
		double[] price= new double[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter symbol: ");
			symbol[i] = kb.nextLine();
			System.out.println("Enter name: ");
			name[i] = kb.nextLine();
			System.out.println("Enter price: ");
			price[i] = kb.nextDouble();
			kb.nextLine();
			if(i == 0) {
				Stock stock1 = new Stock(symbol[0], name[0], price[0]);
				System.out.println(stock1);
			} else {
				Stock stock2 = new Stock(symbol[1], name[1]);
				stock2.setPrice(price[1]);
				System.out.println(stock2);
			}
		}
//		Stock stock1 = new Stock(symbol[0], name[0], price[0]);
//		System.out.println(stock1);
//		
//		Stock stock2 = new Stock(symbol[1], name[1]);
//		stock2.setPrice(price[1]);
//		System.out.println(stock2);
	}

}
