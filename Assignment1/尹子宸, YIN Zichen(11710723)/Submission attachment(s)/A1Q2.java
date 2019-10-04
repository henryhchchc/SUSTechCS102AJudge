import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h1 = scan.nextInt();
        int m1 = scan.nextInt();
        int s1 = scan.nextInt();
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int s2 = scan.nextInt();
        int m3;
        int s;
        int m;
        if (s1>60||s2>60||m1>60||m2>60||h1>24||h2>24||h1>h2){
            System.out.print("Wrong!");
        }else {

            if (s1 > s2) {
                s = s2 + 60 - s1;
                if (m1 > m2) {
                    h2 = h2 - 1;
                    m3 = m2 + 59 - m1;
                } else {
                    m3 = m2 - m1 - 1;
                }
            } else {
                s = s2 - s1;
                if (m1 > m2) {
                    m3 = m1 + 60 - m2;
                    h2 = h2 - 1;
                } else {
                    m3 = m2 - m1;
                }
                }
            m = m3 + (h2 - h1) * 60;
            if (m>0&&s>0) {
                System.out.printf("%dm%ds", m, s);
            }else if(m==0&&s>=0) {
                System.out.printf("%ds",s);
            }else if(s==0&&m>0){
                System.out.printf("%dm",m);
            }
        }
    }
}
