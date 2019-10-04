import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double count = 0;
        double price = 0;
        double mul = 0;

        while(in.hasNext()) {
            ++n;
            if (n % 2 == 1) {
                price = in.nextDouble();
            } else {
                mul = in.nextDouble();
                if (mul % 1.0D == 0.0D) {
                    count += price * mul;
                } else {
                    count = count + price / 2.0D + 1.0D + price * (mul - 0.5D);
                }
            }
        }

        System.out.println(count);
    }
}