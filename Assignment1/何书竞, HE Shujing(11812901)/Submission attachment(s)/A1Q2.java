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
        if (s1 <= s2) {
            int i = 60 * (h2 - h1) + m2 - m1;
            int t1 =i;
            int t2 = s2 - s1;
            if (t1 == 0 && t2 == 0)
                System.out.println("0s");
            else if (t2 == 0 && t1 != 0) {
                System.out.printf(t1 + "m");
            }
            else if (t1 == 0 && t2 != 0) {
                System.out.printf(t2 + "s");
            }
            else {
                System.out.printf(t1 + "m" + t2 + "s");
            }
        }
            }
        }