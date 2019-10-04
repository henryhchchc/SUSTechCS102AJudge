
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        double pieces;
        double total = 0;
        while (input.hasNext()) {
            price = input.nextDouble();
            pieces = input.nextDouble();
            double a = pieces % 1;
            double b = pieces / 1 - a;

            if (a == 0) {
                total += price * pieces;
            } else {
                total += Math.round(a * price) + 1 + price * b;
            }

        }
        System.out.printf("%.1f", total);


    }
}
