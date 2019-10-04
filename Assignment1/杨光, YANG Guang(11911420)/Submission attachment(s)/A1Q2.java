import java.io.PrintStream;
import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        scan.close();
        int g = (d - a) * 60 + e - b;
        int h = f - c;
        if (g != 0 && h == 0) {
            System.out.printf("%dm", g);
        } else if (g == 0 && h != 0) {
            System.out.printf("%ds", h);
        } else if (g == 0 && h == 0) {
            System.out.print("0s");
        } else if (g > 0 && h > 0) {
            System.out.printf("%dm%ds", g, h);
        } else if (g > 1 && h < 0) {
            g--;
            h += 60;
            System.out.printf("%dm%ds", g, h);
        }else if (g == 1 && h < 0) {
            h += 60;
            System.out.printf("%ds", h);
        }
    }
}
