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
        int total = (hour2-hour1)*60*60 + (minute2-minute1)*60 +(second2-second1);
        int second = total%60,minute = total/60;
        if(minute == 0 && second != 0){System.out.println( second + "s");}
        else if(minute != 0 && second == 0){System.out.println(minute + "m");}
        else if(minute == 0 && second == 0){System.out.println("0s");}
        else System.out.println(minute + "m" + second + "s");
    }
}
