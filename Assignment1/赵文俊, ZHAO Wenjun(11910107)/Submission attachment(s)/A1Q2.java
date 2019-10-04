import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int minutes = input.nextInt();
        int seconds = input.nextInt();
        int hours1 = input.nextInt();
        int minutes1 = input.nextInt();
        int seconds1 = input.nextInt();
        int a = (hours1-hours)*3600+(minutes1-minutes)*60+(seconds1-seconds);
        int b =a%60;
        int c =(a-a%60)/60;
        if(a>0&&a<=86400&&b!=0) {

            System.out.printf("%dm%ds", c, b);
        }else if(a>0&&a<=86400&&b==0){
            System.out.printf("%dm",c);


        }else if(a==0){
            System.out.println("0s");
        }






    }
}


