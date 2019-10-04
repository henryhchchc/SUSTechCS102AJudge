import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        double price;
        double portion;
        double sum = 0;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            price = in.nextDouble();
            portion = in.nextDouble();
            if (portion % 1 == 0) {
                a = price * portion;
                sum = sum + a;
            } else {
                b = price * portion + 1;
                c = b * 100;
                d = c % 10;
                f = c / 10;
                if (d > 4)
                    e = f * 0.1 + 0.1;
                else
                    e = f * 0.1;
                sum = sum + e;
            }
        }
        System.out.printf("%.1f",sum);
    }
}




