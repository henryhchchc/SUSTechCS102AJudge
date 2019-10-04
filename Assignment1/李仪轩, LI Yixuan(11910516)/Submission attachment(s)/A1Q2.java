import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        int SecondAll = (h2-h1)*3600+(m2-m1)*60+(s2-s1);
        int Minute = SecondAll/60;
        int Second = SecondAll%60;
        if ( Minute == 0 )
            System.out.printf("%ds",Second);
        else if ( Second == 0 )
            System.out.printf("%dm",Minute);
        else
            System.out.printf("%dm%ds",Minute,Second);
    }
}