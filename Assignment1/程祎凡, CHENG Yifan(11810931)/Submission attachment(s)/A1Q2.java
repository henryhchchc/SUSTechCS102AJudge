import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int b1 = input.nextInt();
        int c1 = input.nextInt();
        int a2 = input.nextInt();
        int b2 = input.nextInt();
        int c2 = input.nextInt();
        int C = c2 - c1;
        int B = b2 - b1;
        int A = a2 - a1;
        if (C < 0) {
            C += 60;
            --B;
        }
        if (B < 0) {
            B += 60;
            --A;
        }

        B += A * 60;

        if (B == 0) {
                System.out.println(C + "s");
        }
        else if (C == 0) {
            System.out.println(B + "m");
        }
        else {
            System.out.println(B + "m" + C + "s");
        }

    }
}