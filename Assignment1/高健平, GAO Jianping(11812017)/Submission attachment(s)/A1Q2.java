import java.util.Scanner;
public class A1Q2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
            int hour1=in.nextInt();
            int minuter1=in.nextInt();
            int seconds1=in.nextInt();
            int hours2=in.nextInt();
            int minutes2=in.nextInt();
            int seconds2=in.nextInt();
        int minuter=(hours2-hour1)*60+(minutes2-minuter1);
        int seconds=seconds2-seconds1;
        while(seconds<0){
            seconds+=60;
            minuter-=1;
    }
        if(minuter == 0)
           System.out.printf("%ds",seconds);
        else
            if(seconds==0)
                System.out.printf("%dm",minuter);
            else
                System.out.printf("%dm%ds",minuter,seconds);
}}
