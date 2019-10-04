import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1, m1, s1;
        int h2, m2, s2;
        int h, m, s;
        h1 = input.nextInt();
        m1 = input.nextInt();
        s1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();
        s2 = input.nextInt();
        h = h2 - h1;
        m = m2 - m1;
        s = s2 - s1;
        if (h == 0) {
            if (m == 0) {
                System.out.printf("%ds", s);
            } else {
                if (s < 0) {
                    s = s + 60;
                    m = m - 1;
                    if (m == 0) {
                        System.out.printf("%ds", s);
                    } else {
                        System.out.printf("%dm%ds", m, s);
                    }
                } else if (s == 0) {
                    System.out.printf("%dm", m);
                } else {
                    System.out.printf("%dm%s", m, s);
                }
            }
        } else {
            if (m == 0) {
                m = m + h * 60;
                if (s == 0) {
                    System.out.printf("%dm",m);
                }else{
                    System.out.printf("%dm%ds", m, s);
                }
            } else if (m < 0) {
                h = h - 1;
                m = m + 60 + 60 * h;
                if (s < 0) {
                    s = s + 60;
                    m = m - 1;
                    if (m == 0) {
                        System.out.printf("%ds", s);
                    } else {
                        System.out.printf("%dm%ds", m, s);
                    }
                } else if (s == 0) {
                    System.out.printf("%dm", m);
                } else {
                    System.out.printf("%dm%s", m, s);
                }
            } else {
                if (s < 0) {
                    s = s + 60;
                    m = m - 1+60*h;
                    if (m == 0) {
                        System.out.printf("%ds", s);
                    } else {
                        System.out.printf("%dm%ds", m, s);
                    }
                } else if (s == 0) {
                    m=m+60*h;
                    System.out.printf("%dm", m);
                } else {
                    System.out.printf("%dm%s", m, s);
                }


            }
        }
    }
}