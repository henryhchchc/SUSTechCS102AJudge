import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();

        g = ((d - a) * 60 + (e - b)) * 60 + (f - c);
        h = g / 60;
        i = g % 60;

        if (i > 0)
            System.out.printf("%dm%ds", h, i);
        else System.out.printf("%ds", i);
    }
}
