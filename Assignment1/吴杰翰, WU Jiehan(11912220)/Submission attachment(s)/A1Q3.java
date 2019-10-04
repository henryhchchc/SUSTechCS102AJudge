import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {

        float total = 0;
        Scanner input = new Scanner(System.in);
        while (input.hasNextFloat()) {
            float price = input.nextFloat();
            float number = input.nextFloat();
            while (number > 0) {
                if (number >= 1) {
                    number = number - 1;
                    total = price + total;
                }
                else {
                    number = number - 1;
                    price = Math.round(price / 2);
                    total = price + 1 + total;
                }
            }
        }
        System.out.printf("%.1f", total);
    }
}
