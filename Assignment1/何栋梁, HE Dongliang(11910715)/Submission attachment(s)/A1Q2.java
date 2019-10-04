import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int h1, m1, s1, h2, m2, s2;
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        if(s2-s1 >= 0) {
            int m = (h2 - h1) * 60 + m2 - m1;
            int s = s2 - s1;
            if (m == 0) {
                System.out.printf("%ds", s);
            }
            if ((m != 0) && (s == 0)) {
                System.out.printf("%dm", m);
            }
            if ((m != 0) && (s != 0)) {
                System.out.printf("%dm%ds", m, s);
            }
        }
        if(s2-s1<0){
            int m = (h2 - h1) * 60 + m2 - m1-1;
            int s = s2+60-s1;
            if (m == 0) {
                System.out.printf("%ds", s);
            }
            if ((m != 0) && (s == 0)) {
                System.out.printf("%dm", m);
            }
            if ((m != 0) && (s != 0)) {
                System.out.printf("%dm%ds", m, s);
            }
        }

    }
}
