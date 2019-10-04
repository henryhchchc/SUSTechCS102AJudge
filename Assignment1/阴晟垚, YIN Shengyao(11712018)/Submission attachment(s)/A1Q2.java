import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        int beg[] = new int[3];
        int end[] = new int[3];
        int del[] = new int[3];
        Scanner input = new Scanner(System.in);
        beg[0] = input.nextInt();
        beg[1] = input.nextInt();
        beg[2] = input.nextInt();
        end[0] = input.nextInt();
        end[1] = input.nextInt();
        end[2] = input.nextInt();

        for (int i = 0; i < beg.length; i++) {
            del[i] = end[i] - beg[i];
        }
        int h = del[0], m = del[1], s = del[2];
        int sum = h * 60 * 60 + m * 60 + s;
        s = sum % 60;
        m = (sum - (sum % 60)) / 60;
        if (m == 0) {
            System.out.printf("%ds", s);
        } else {
            if (s == 0) {
                System.out.printf("%dm", m);
            } else
                System.out.printf("%dm%ds", m, s);
        }

    }
}
