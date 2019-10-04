import java.math.BigDecimal;
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        while (input.hasNext()) {
            double price = input.nextDouble();
            double number = input.nextDouble();
            double price1;
            if ((number * 2) % 2 != 0) {
                price1 = Math. round(price /2 *10)/10.0;
                totalPrice = totalPrice + price1 + 1 + price * (number - 0.5);
            }else
                totalPrice = totalPrice + price * number;
        }
        System.out.println(totalPrice);

    }
}
