import java.math.BigDecimal;
import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            double price = in.nextDouble();
            double amount = in.nextDouble();

            int n = 0;
            double sum = 0;

            while (amount > 0.5) {
                n = n + 1;
                amount = amount - 1;

                double price2 = amount * price;
                double p2 = new BigDecimal(price2).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
               if(p2==0)
                sum = n * price;
               else
                   sum = n * price + p2 + 1;
            }

            System.out.printf("%.1f", sum);
        }

    }
}
