import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double a=0,b=0,c=0;
        while (in.hasNext()) {
            a = in.nextDouble();
            b = in.nextDouble();

            if (b % 1 == 0) {
                c += a * b;
            } else c += a * (b - 0.5) + a / 2 + 1;
            c=Math.round(c);
        }
        System.out.printf("%.1f", c);

    }
}
