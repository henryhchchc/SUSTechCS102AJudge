import java.util.Scanner;

public class A2Q2 {
    public static void main(String[] args) {
        int hour=0;
        int minute=0;
        int second=0;
        int n=0;
        Scanner input=new Scanner(System.in);
        while(n <2){
            hour = input.nextInt() - hour;
            minute = input.nextInt() - minute;
            second = input.nextInt() - second;
            n = ++n;
        }
        minute = minute+60*hour;

        if(second < 0 ) {
            minute = --minute;
            second = second + 60;
        }
        if(minute == 0){
            System.out.printf("%ds",second);
        }
        else if(second==0){
            System.out.printf("%dm",minute);
        }
        else{
            System.out.printf("%dm%ds",minute,second);
        }
        // write your code here
    }
}
