import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;

        while (input.hasNext()) {
            double price = input.nextDouble();
            double number = input.nextDouble();
            if (number % 1 > 0) {
                String str_b = String.format("%.1f", price * number);
                double P = Double.parseDouble(str_b);
                sum += P + 1;
            } else
                sum += price * number ;
        }
        System.out.printf("%.1f", sum);

    }
}

