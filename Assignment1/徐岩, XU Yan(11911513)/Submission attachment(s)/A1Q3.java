import java.util.Scanner;

public class A1Q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double money = 0;
		double price1, price2, price3,b;
		double price4,price5;
		int a;
		while (in.hasNext()) {
			double price = in.nextDouble();
			double number = in.nextDouble();
			b = number % 1;
			if (b == 0) {
				money = money + price * number;
			} else {
				a = (int)number / 1;
				price1 = a * price;
				price2 = price/2 + 1;
				price4 = price2 * 100- (price2 * 100)%1;
				price5 = price2 * 10- (price2 * 10)%1;
				price3 = price4 % 10;
				if (price3 >= 5) {
					price2 = (price5 + 1)/10;
				} else {
					price2 = price5 /10;
				}
				money = money + price1 + price2;
						}
		}
		System.out.printf("%.1f", money);
	}

}
