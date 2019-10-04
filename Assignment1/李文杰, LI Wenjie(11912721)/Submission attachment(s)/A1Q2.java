import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int hour1=time.nextInt();
        int minute1=time.nextInt();
        int second1=time.nextInt();
        int hour2=time.nextInt();
        int minute2=time.nextInt();
        int second2=time.nextInt();
        int subtraction=hour2*3600+minute2*60+second2-hour1*3600-minute1*60-second1;
        int minute3=subtraction/60;
        int second3=subtraction%60;
        if(minute3==0&&second3==0){
            System.out.println("0s");
        }else if(minute3==0){
            System.out.printf("%ds",second3);
        }else if(second3==0){
            System.out.printf("%dm",minute3);
        }else{
            System.out.printf("%dm%ds",minute3,second3);
        }
    }
}