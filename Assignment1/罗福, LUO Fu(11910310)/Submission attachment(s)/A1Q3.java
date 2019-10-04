import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");

        double c = 0;
        double d = 0;
        double e = 0;
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b % 1 == 0) {
                c = c + (a * b);
            } else {
                d = d + (b-0.5)*a+Math.round(a/2 )+ 1; }
            e = c + d;
        }
            System.out.printf("%.1f",e);
        }
    }


