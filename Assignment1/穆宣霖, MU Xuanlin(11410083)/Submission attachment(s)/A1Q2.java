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

        int h = h2 - h1;
        int m = m2 - m1;
        int s = s2 - s1;

        if(h==0 && m==0)
            System.out.printf("%ds", s);
        else {
            if (s == 0)
                System.out.printf("%dm", h * 60 + m);
            if (s < 0)
                System.out.printf("%dm%ds", h * 60 + m - 1, s + 60);
            if (s > 0)
                System.out.printf("%dm%ds", h * 60 + m, s);
             }


    }
}
