import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();

        int min = 60*( h2 - h1 ) + m2 - m1;
        int sec = s2 - s1;

        if (min == 0) {
            System.out.printf("%ds",sec);
        }else if (sec < 0) {
            min--;
            sec += 60;
            System.out.printf("%dm%ds", min, sec);
        } else if (sec == 0) {
            System.out.printf("%dm", min);
        } else {
            System.out.printf("%dm%ds", min, sec);
        }
    }
}
