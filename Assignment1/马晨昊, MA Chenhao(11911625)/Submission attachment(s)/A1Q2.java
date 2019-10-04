import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1, a2, b1, b2, c1, c2;
        System.out.print("begin time");
        a1 = input.nextInt();
        b1 = input.nextInt();
        c1 = input.nextInt();
        System.out.print("ending time");
        a2 = input.nextInt();
        b2 = input.nextInt();
        c2 = input.nextInt();
        int m1 = (a2 - a1) * 60;
        int m = m1 + b2 - b1;
        int s = c2 - c1;
        if (s < 0) {
            m = m - 1;
            s = s + 60;
            System.out.printf("%d minutes,%d seconds", m, s);
        } else {
            System.out.printf("%d minute, %d seconds", m, s);
        }
    }
}