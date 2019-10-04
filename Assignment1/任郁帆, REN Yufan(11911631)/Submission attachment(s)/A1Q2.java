import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour1, minute1, second1;
        int hour2, minute2, second2;
        int hour,minute, second;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2 = input.nextInt();
        if (second1 > second2) {
            minute2 -= 1;
            second2 += 60;
        }
        second = second2 - second1;
        if (minute1 > minute2) {
            hour2 -= 1;
            minute2 += 60;
        }
        hour=hour2-hour1;
        minute=hour*60+minute2-minute1;
        if (second == 0 && minute!=0) {
            System.out.printf("%dm", minute);
        }
        if (minute == 0 && second!=0) {
            System.out.printf("%ds", second); }
        if(second!=0 && minute!=0) {
            System.out.printf("%dm%ds", minute, second);
        }
        if(minute==0&&second==0){
            System.out.print("0s");
        }
    }
}
