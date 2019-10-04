import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double total = 0;
        while (input.hasNextLine()) {
            double price = input.nextDouble();
            double number = input.nextDouble();
            double num = 0;
            double ship = 0;
            if (number % 1 == 0)
                total += price * number;
            else {
                num = Math.floor(number);
                ship += (price * num + (price / 2 + 1));
                ship = Math.round(ship*10)/10.0;
                total += ship;
            }
//            System.out.printf("%.1f %.1f",price,number);
        }
        System.out.printf("%.1f",total);

    }
}
