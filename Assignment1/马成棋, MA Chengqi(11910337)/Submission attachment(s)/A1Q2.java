import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int second1 = sc.nextInt();
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();
        int second2 =sc.nextInt();
        int hour = hour2 - hour1;
        int minute = minute2 - minute1;
        int second =second2 - second1;
        if (hour == 0) {
            if (minute == 0){
                System.out.printf("%ds", second);
            } else if (second == 0){
                System.out.printf("%dm", minute);
            } else if (second < 0){
                second = second + 60;
                minute = minute - 1;
                System.out.printf("%dm%ds", minute, second);
            } else {
                System.out.printf("%dm%ds", minute, second);
            }
        }else {
            minute = minute + hour * 60;
            if(second == 0) {
                System.out.printf("%dm", minute);
            }else if (second < 0) {
                second = second + 60;
                minute = minute - 1;
                System.out.printf("%dm%ds", minute, second);
            }else {
                System.out.printf("%dm%ds", minute, second);
            }
        }
        }

    }
