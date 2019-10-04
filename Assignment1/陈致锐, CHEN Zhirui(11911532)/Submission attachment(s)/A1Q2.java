import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 6;
        int[] num = new int[n];
        while (n > 0) {
            num[6 - n] = scan.nextInt();
            n--;
        }
        int min = (num[3] - num[0]) * 60 + num[4] - num[1];
        int sec = num[5] - num[2];
        if (min == 0) {
            System.out.printf("%ds", sec);
        } else if (sec == 0) {
            System.out.printf("%dm", min);
        } else {
            System.out.printf("%dm%ds", min, sec);
        }
    }


}