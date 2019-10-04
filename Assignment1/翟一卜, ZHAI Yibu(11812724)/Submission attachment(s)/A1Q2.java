import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h1 = 0;
        int m1 = 0;
        int s1 = 0;
        int h2 = 0;
        int m2 = 0;
        int s2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int m3 = 0;
        int s3 = 0;


        System.out.print("");
        h1 = input.nextInt();

        System.out.print("");
        m1 = input.nextInt();

        System.out.print("");
        s1 = input.nextInt();

        System.out.print("");
        h2 = input.nextInt();

        System.out.print("");
        m2 = input.nextInt();

        System.out.print("");
        s2 = input.nextInt();

        sum1 = h1*3600 +m1*60 + s1;
        sum2 = h2*3600 +m2*60 + s2;
        sum3 = sum2 - sum1;
        m3 = sum3/60;
        s3 = sum3%60;

        if (m3 == 0)
            System.out.printf("%ds",s3);
        else if (s3 == 0)
            System.out.printf("%dm", m3);
        else
            System.out.printf("%dm%ds", m3, s3);

    }
}
