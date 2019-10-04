

import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour1 = input.nextInt();
        int min1 = input.nextInt();
        int second1 = input.nextInt();
        int hour2 = input.nextInt();
        int min2 = input.nextInt();
        int second2 = input.nextInt();
        int sum1 = hour1 * 3600 + min1 * 60 + second1;
        int sum2 = hour2 * 3600 + min2 * 60 + second2;
        int min = (sum2 - sum1) / 60;
        int second = (sum2 - sum1) - min * 60;
        if(min == 0)
            System.out.printf("%ds", second);
        else if(second == 0)
            System.out.printf("%dm", min);
        else if(min > 0 && second > 0)
            System.out.printf("%dm%ds", min, second);

    }
}