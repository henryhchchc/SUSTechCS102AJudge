import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price, number, total = 0;
        while (input.hasNextFloat()) {
            price = input.nextFloat();
            number = input.nextFloat();
            if (number % 1 == 0) {
                total += price * number;
            } else {
                float number1 = number - number % 1;
                float number2 = number % 1;
                total += price * number1 + Math.round(price*number2*10+10)/10;
            }
        }
        System.out.printf("%.1f", total);
    }
}
