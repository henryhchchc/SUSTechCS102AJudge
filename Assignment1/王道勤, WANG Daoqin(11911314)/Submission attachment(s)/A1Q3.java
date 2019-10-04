import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.*;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double number = in.nextDouble();
            {
                if (number % 1 != 0)
                    total += price * number + 1;
                else
                    total += price * number;
                total = parseDouble(new DecimalFormat("0.0").format(total));

            }
        }
            System.out.printf("%.1f",total);


    }

}
