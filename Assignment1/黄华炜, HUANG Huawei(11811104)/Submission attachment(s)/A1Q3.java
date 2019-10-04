//package Assignment;

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double totle = 0;

        while (scan.hasNext()) {
            double price = scan.nextDouble();
            double number = scan.nextDouble();

            if (number - (int) number != 0) {
                totle += (price * (int) number) + (Math.round(price / 2) + 1);
            } else {
                totle += price * number;
            }
        }

        System.out.println(totle);

    }
}
