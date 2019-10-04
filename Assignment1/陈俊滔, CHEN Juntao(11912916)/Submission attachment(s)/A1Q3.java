import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double piece = in.nextDouble();
            if (piece % 1 == 0) {
                sum = sum + price * piece;
            } else if (piece % 1 == 0.5) {
                double a, b;
                a = price * (piece - 0.5);
                b = price / 2 + 1 ;
                String str_b = String.format("%.1f", b);
                double b1 = Double.parseDouble(str_b);
                sum = sum + a + b1 ;
            }
        }
        System.out.printf("%.1f",sum);
    }

}