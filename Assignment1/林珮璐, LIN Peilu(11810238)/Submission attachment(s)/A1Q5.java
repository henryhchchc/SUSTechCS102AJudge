
public class A1Q5 {
	public static void main(String[] args) {
		int length = args.length;
		int amount = 0;
		double price;
		int priceInt;
		int priceInt10;
		int priceInt1;
		int unit;
		double correct;

		while (amount < length) {
			price = Double.parseDouble(args[amount]);
			priceInt = (int) price;
			priceInt10 = priceInt / 10;
			priceInt1 = priceInt10 * 10;
			unit = priceInt - priceInt1;
			if (unit == 2) {
				correct = price + 4;
				System.out.print(correct+" ");
			} else {
				if (unit == 4) {
					correct = price + 5;
					System.out.print(correct+" ");
				}
			}
			amount++;
		}
	}
}
