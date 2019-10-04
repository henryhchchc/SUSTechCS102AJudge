import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int hour = in.nextInt();
        int minutes = in.nextInt();
        int seconds = in.nextInt();
        int tHour = in.nextInt();
        int tMinutes =in.nextInt();
        int tSeconds = in.nextInt();
        int sc = ( tHour - hour) * 3600 + ( tMinutes - minutes) * 60 + tSeconds - seconds;
        int m = sc / 60;
        int s = sc % 60;
        if( sc < 0){
            System.out.print(" you are on your meal time !");
        }
        else{
            if(m > 0 ) {
                System.out.print(m + "m");
                if (s > 0)
                    System.out.print(s + "s");
            }
            else
                System.out.print(s + "s");
        }
    }
}
