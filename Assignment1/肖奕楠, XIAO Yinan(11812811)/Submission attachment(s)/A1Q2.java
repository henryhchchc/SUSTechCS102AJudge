import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hourB = input.nextInt();
        int minuteB = input.nextInt();
        int secondB = input.nextInt();
        int hourE = input.nextInt();
        int minuteE = input.nextInt();
        int secondE = input.nextInt();
        int hours = hourE - hourB;
        int minutes = minuteE - minuteB + hours*60;
        int seconds = secondE - secondB;
        if(minutes == 0){
            if(seconds == 0){
                System.out.printf("0s");
            }
            else
                System.out.printf("%ds",seconds);
        }
        else if(seconds == 0)
            System.out.printf("%dm",minutes);
        else if(seconds < 0) {
            seconds += 60;
            minutes--;
            System.out.printf("%dm%ds",minutes,seconds);
        }else
            System.out.printf("%dm%ds",minutes,seconds);
    }
}
