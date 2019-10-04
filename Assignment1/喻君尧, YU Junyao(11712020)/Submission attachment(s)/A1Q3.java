

import java.util.Scanner;

public class A1Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum = 0;
		while (in.hasNext()) {
			double price = in.nextDouble();
			double amount = in.nextDouble();
			if (Math.floor(amount) == amount) {
				sum = sum + price * amount;
			} else if (Math.floor(amount) != amount) {
				sum = sum + (price * amount * 100 + 5) / 100 + 1;
			}

		}
		System.out.println(sum);
	}

}
