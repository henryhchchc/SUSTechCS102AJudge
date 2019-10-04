import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int hh1 = time.nextInt();
        int mm1 = time.nextInt();
        int ss1 = time.nextInt();
        int hh2 = time.nextInt();
        int mm2 = time.nextInt();
        int ss2 = time.nextInt();

        int btime = hh1 * 3600 + mm1 * 60 + ss1;
        int etime = hh2 * 3600 + mm2 * 60 + ss2;
        int mm3 = (etime - btime) / 60;
        int ss3 = (etime - btime) % 60;

        if (mm3 == 0 && ss3 == 0)
            System.out.println("0s");
        else if (mm3 == 0 && ss3 != 0)
            System.out.printf("%ds", ss3);
        else if (mm3 != 0 && ss3 == 0)
            System.out.printf("%dm", mm3);
        else
            System.out.printf("%dm%ds", mm3, ss3);
    }
}
