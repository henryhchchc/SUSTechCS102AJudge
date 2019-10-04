import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int hour1=Integer.parseInt(args[0]);
       int hour2=Integer.parseInt(args[3]);
       int minute1=Integer.parseInt(args[1]);
       int minute2=Integer.parseInt(args[4]);
       int second1=Integer.parseInt(args[2]);
       int second2=Integer.parseInt(args[5]);
       int hour=hour2-hour1;
       int minute=minute2-minute1;
       int second=3600*hour+60*minute+second2-second1;
       int minutes =second/60;
       int seconds ;
       seconds= second-60*minutes;
       System.out.printf(minutes+"m"+seconds+"s");
}
}