import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        double total = 0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            double price;
            double number;
            price = input.nextDouble();
            number = input.nextDouble();
            int a = (int) (number / 1);
            int b = (int) (number * 10 % 10);
            if(b == 5) {
                total = total + price * a;
                price = price / 2 + 1;
                int c = (int) (price * 10 + 0.5);
                total = total +c / 10.0;
            }
            else if(b == 0) {
                total = price * number + total;
            }
        }
        System.out.println(total);
    }
}