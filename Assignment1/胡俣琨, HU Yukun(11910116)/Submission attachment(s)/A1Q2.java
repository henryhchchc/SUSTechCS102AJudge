import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hour1 = input.nextInt();
        int minute1 = input.nextInt();
        int second1 = input.nextInt();
        int hour2 = input.nextInt();
        int minute2 = input.nextInt();
        int second2 = input.nextInt();

        int number, minutes, seconds;
        number=hour2*3600+ minute2*60+ second2-hour1*3600-minute1*60-second1;
        minutes = number / 60;
        seconds = number % 60;

        if(minutes==0)
            System.out.printf("%ds", seconds);
        else if(seconds==0)
            System.out.printf("%dm", minutes);
        else
            System.out.printf("%dm%ds", minutes, seconds);
    }
}
