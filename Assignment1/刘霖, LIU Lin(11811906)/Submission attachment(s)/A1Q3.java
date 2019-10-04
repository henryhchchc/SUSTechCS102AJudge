import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double i = 0;
        while (in.hasNext()) {
            System.out.print("");
            double price = in.nextDouble();
            double amount = in.nextDouble();
            double k = amount - Math.floor(amount);
                double total = price * Math.floor(amount) + 2 * k * (Math.round(price * k) +1);
             i = total + i;
        }
        System.out.printf("%.1f", i);
    }
}
