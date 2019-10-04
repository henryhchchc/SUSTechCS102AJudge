import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float price;
        float number;
        double sum = 0;
        while (input.hasNext())
        {
            price = input.nextFloat();
            number = input.nextFloat();

            if (number % 1 == 0)
            {
                sum = sum + price * number;
            }
            else
            {
                sum = sum + Math.round(price / 2 + 1) + price * (number - 0.5);
            }
        }
        System.out.printf("%.1f", sum);
    }
}
