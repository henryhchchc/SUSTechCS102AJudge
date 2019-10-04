import java.util.Scanner;
    public class A1Q2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int h1 = input.nextInt();
            int m1 = input.nextInt();
            int s1 = input.nextInt();
            int h2 = input.nextInt();
            int m2 = input.nextInt();
            int s2 = input.nextInt();
            int seconds1, seconds2, t;
            int m = 0, s = 0, error = 0;
            seconds1 = 3600 * h1 + 60 * m1 + s1;
            seconds2 = 3600 * h2 + 60 * m2 + s2;
            t = seconds2 - seconds1;
            if (t >= 0 ) {
                m = t / 60;
                s = t % 60;
            } else {
                System.out.println("error");
                error = 1;
            }
            if (error == 0 & t == 0) {
                System.out.printf("%ds", t);}
            else{
                if (error == 0 & m == 0) {
                    System.out.printf("%ds", s);
                }
                if (error == 0 & s == 0) {
                    System.out.printf("%dm", m);
                }
                if (error == 0 & m != 0 & s != 0) {
                    System.out.printf("%dm%ds", m, s);
                }
            }
        }
    }

