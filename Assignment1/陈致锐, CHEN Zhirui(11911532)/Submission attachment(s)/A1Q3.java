import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total_price = 0;
        double sum = 0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double num = in.nextDouble();
            double num1 = num - Math.floor(num);
            {
                if (num1 == 0.5) {
                    double sum1 = price / 2 + 1;
                    double sum2 = Math.round(sum1*10)/10;
                    sum = Math.floor(num) * price + sum2;
                } else {
                    sum = price * num;
                }
                total_price = total_price + sum;
            }
        }
        System.out.printf("%.1f",total_price);


    }
}
