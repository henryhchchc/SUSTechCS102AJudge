import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        while (in.hasNext()) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c;
                if ((b /(0.5)) % 2 != 0) {
                    c=Math.round(a);
                    sum += (b - 0.5) * a + c/ 2 + 1;
                } else {
                    sum += a * b;
                }
        }
        System.out.printf("%.1f",sum);
    }
}





