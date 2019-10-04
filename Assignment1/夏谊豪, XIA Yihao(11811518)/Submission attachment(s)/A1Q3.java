import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        double totalPrice = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double price = in.nextDouble();
            double number1 = in.nextDouble();
            int number2 = (int) number1;
            if (number2 == number1) {
                totalPrice = totalPrice + price * number1;
            } else {
                double raise = price * number1 + 1;
                if (raise % 0.1 != 0) {
                    raise = (double) ((int) (raise / 0.1 + 1)) / 10;
                }
                totalPrice = totalPrice + raise;
            }
        }
        System.out.println(String.format("%.1f", totalPrice));
    }
}
