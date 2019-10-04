import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double per;

        while (input.hasNext()){
            double price = input.nextFloat();
            double number = input.nextFloat();
            if (number % 1 == 0)
                per = price * number ;
            else
                per = (price + 0.1)* 0.5 + price * (number - 0.5) + 1;
            total = total +per;
        }
        System.out.printf("%.1f", total);
    }
}