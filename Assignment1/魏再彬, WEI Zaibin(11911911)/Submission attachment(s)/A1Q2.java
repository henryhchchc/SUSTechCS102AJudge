import java.util.Scanner;

public class A1Q2 {
    static Scanner imput = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        a = imput.nextInt();
        b = imput.nextInt();
        c = imput.nextInt();
        d = imput.nextInt();
        e = imput.nextInt();
        f = imput.nextInt();
        if (d >= a && a < 24 && a >= 0 && d < 24 && d >= 0 && b >= 0 && b < 60 && c >= 0 && c < 60 && e >= 0 && e < 60 && f >= 0 && f < 60) {
            int sum1 = d - a;
            e = sum1 * 60 + e;
            if (e >= b) {
                int sum2 = e - b;
                f = sum2 * 60 + f;
                if (f >= c) {
                    int sum3 = f - c;
                    if (sum3 == 0) {
                        System.out.println("0s");
                    } else if (sum3%60!=0&&sum3<60) {
                        System.out.println(sum3+"s");
                    } else if (sum3%60==0) {
                        System.out.println(sum3 % 60 + "m");
                    } else {
                        System.out.println(sum3 / 60 + "m" + sum3 % 60 + "s");
                    }
                }
            }

        } else {
            System.out.println("the time is wrong");
        }
    }
}