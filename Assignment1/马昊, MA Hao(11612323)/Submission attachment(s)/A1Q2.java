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
        int detM = (h2 - h1) * 60 + m2 - m1;
        int detS = s2 - s1;
        if (detS < 0) {
            detM = detM - 1;
            detS = 60 + detS;
        }
        if (detS == 0) {
            System.out.println(detM + "m");
        } else {
            System.out.println(detM + "m" + detS + "s");
        }
    }
}
