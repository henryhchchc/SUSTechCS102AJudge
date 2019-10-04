import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        int bth;
        int btm;
        int bts;
        int fth;
        int ftm;
        int fts;
        Scanner input = new Scanner(System.in);
        bth = input.nextInt();
        btm = input.nextInt();
        bts = input.nextInt();
        fth = input.nextInt();
        ftm = input.nextInt();
        fts = input.nextInt();
        int second = (60 * 60 * (fth - bth) + 60 * (ftm - btm) + fts - bts) % 60;
        int minute = (60 * 60 * (fth - bth) + 60 * (ftm - btm) + fts - bts) / 60;
        if (second == 0 && minute == 0)
            System.out.println("0s");
        else if (second == 0 && minute > 0)
            System.out.println(minute + "m");
        else if (second > 0 && minute == 0)
            System.out.println(second + "s");
        else if (second > 0 && minute > 0)
            System.out.println(minute + "m" + second + "s");
    }
}