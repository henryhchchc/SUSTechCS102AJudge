import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beginningHour = input.nextInt();
        int beginningMinute = input.nextInt();
        int beginningSecond = input.nextInt();
        int endHour = input.nextInt();
        int endMinute = input.nextInt();
        int endSecond = input.nextInt();
        int minute = (endHour - beginningHour) * 60 + endMinute - beginningMinute;
        int second = endSecond - beginningSecond;
        if (second < 0) {
            second += 60 ;
            minute -=  1;
        }

        if (minute == 0 || second == 0) {
            if (minute == 0 && second == 0) {
                System.out.print("0s");
            } else if (minute == 0) {
                System.out.printf("%ds", second);
            } else if (second == 0) {
                System.out.printf("%dm", minute);
            }
        }else {
                System.out.printf("%dm%ds", minute, second);
            }
        }
    }


