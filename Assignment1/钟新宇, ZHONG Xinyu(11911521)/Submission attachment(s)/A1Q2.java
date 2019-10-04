import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int hour1, minute1, second1, hour2, minute2, second2, hour3, minute3, second3;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2 = input.nextInt();

        hour3 = (hour2 * 3600 + minute2 * 60 + second2 - hour1 * 3600 - minute1 * 60 - second1) / 3600;
        minute3 = (hour2 * 3600 + minute2 * 60 + second2 - hour1 * 3600 - minute1 * 60 - second1 ) / 60;
        second3 = (hour2 * 3600 + minute2 * 60 + second2 - hour1 * 3600 - minute1 * 60 - second1 - minute3 * 60) % 60;
        if(second3 == 0)
        {
            System.out.printf("%dm", minute3);
        }
        else if (minute3 == 0 && second3 == 0)
        {
            System.out.println("0s");
        }
        else
        {
            System.out.printf("%dm%ds", minute3, second3);
        }
    }
}
