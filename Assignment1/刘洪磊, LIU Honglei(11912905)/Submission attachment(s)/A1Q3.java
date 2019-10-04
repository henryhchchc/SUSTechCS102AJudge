
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        double sum = 0;


        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double price = input.nextDouble();
            double n = input.nextDouble();
            double checknumber = n * 2;
            if (checknumber % 2 == 0) {
                double cost = price * n;
                sum = sum + cost;
            } else {
                double cost = price * n + 1;

                sum = sum + cost;
                sum = (double)(Math.round(sum*10)/10.0);
            }
        }
        System.out.println(sum);


    }
}
