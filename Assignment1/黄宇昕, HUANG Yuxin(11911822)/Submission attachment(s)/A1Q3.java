import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        double total,money;
        money=0;
        Scanner in = new Scanner(System.in);
	while(in.hasNext()) {
		double price = in.nextDouble();
		double number = in.nextDouble();
		double x = (int) number;
		double y = number-x;
		if (y != 0) {
			double z = price/2+1;
			long s = Math.round(z);
			total = price*x + s;
			money=money+total;
		} else {
			total = price * number;
			money=money+total;
		}
	}
	System.out.printf("%.1f", money);
    }
}
