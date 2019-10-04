import java.util.Scanner;

public class A1Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double priceForOne;
		double amount;
		double priceHalf;
		double priceHalf10;
		double price;
		double totalPrice1 = 0;
		double totalPrice = 0;


		while (in.hasNext()) {
			priceForOne = in.nextDouble();
			amount = in.nextDouble();

			if (amount % 1 == 0) {
				price = priceForOne * amount;
			} else {
				priceHalf = priceForOne / 2 + 1;
				priceHalf10 = 10 * priceHalf;
				double decimal = priceHalf10 - (double) ((int) priceHalf10);
				if (decimal >= 0.5) {
					priceHalf = ((double) (int) priceHalf10 + 1) / 10;
				} else {
					priceHalf = (double) (int)priceHalf10 / 10;
				}
				price = priceForOne * (amount - 0.5) + priceHalf;
			}
			totalPrice1 += price;
		}
		System.out.printf("%.1f", totalPrice1);
		/*
		int totalPrice10 = (int)(10*totalPrice1);
		totalPrice = (double)totalPrice10/10;
		System.out.println(totalPrice);*/
	}
}
