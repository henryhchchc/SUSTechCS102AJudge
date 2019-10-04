import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        while (in.hasNext()) {
            a = in.nextDouble();
            b = in.nextDouble();
            if (b % 1 == 0)
                c = c + a * b;
            else if(b % 1 != 0)
                c = c + Math.floor(b) * a + Math.round(a *10*0.5)*0.1 + 1;
            }
            System.out.printf("%.1f", c);
    }
}

