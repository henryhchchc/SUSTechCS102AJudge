package javaa;

import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int second1 = sc.nextInt();
        int hour2 = sc.nextInt();
        int minute2 = sc.nextInt();
        int second2 = sc.nextInt();

        if(hour2-hour1!=0 || minute2-minute1!=0) {
            int minute = (hour2 - hour1) * 60 + minute2 - minute1;
            if(second2-second1>0){
                int second = second2-second1;
                System.out.printf("%dm%ds\n",minute,second);
            }else if(second2-second1<0){
                int second = 60-second1+second2;

                if(minute > 1) System.out.printf("%dm%ds\n", minute-1,second);
                else System.out.printf("%ds\n", second);
            }else{
                System.out.printf("%dm\n",minute);
            }
        }
        else System.out.println(second2-second1+"s");
    }
}
