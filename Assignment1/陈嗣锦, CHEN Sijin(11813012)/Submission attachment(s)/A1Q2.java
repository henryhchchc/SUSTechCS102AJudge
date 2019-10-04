import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1, m1, s1;
        int h2, m2, s2;
        int a, h, m, s;
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        a = (h2 * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1);
        h = a / 3600;
        m = (a - h * 3600) / 60;
        s = a-h*3600-m*60;
        if (m == 0 & s == 0) {
            System.out.println("0s");
        }else if (s==0 & m!=0){
            System.out.println(h*60+m+"m");
        }else
            System.out.printf("%dm%ds",h*60+m,s);
    }
}