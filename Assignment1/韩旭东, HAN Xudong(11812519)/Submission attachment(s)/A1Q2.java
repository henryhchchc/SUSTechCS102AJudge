import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2, m3, s1, s2, s3, sum1, sum2, waittime;
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        s1 = sc.nextInt();
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        s2 = sc.nextInt();
        sum1 = h1 * 3600 + m1 * 60 + s1;
        sum2 = h2 * 3600 + m2 * 60 + s2;
        waittime = sum2 - sum1;
        m3 = waittime / 60;
        s3 = waittime - m3 * 60;
        if(m3 != 0){
            System.out.printf("%dm", m3);
        }
        if(s3 != 0){
            System.out.printf("%ds", s3);
        }
        if(m3 == 0 && s3 == 0){
            System.out.print("0s");
        }
        System.out.println();
    }
}
