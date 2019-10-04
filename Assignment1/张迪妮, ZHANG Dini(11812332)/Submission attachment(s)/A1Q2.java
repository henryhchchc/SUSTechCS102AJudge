import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number1 = in.next();
        String number2 = in.next();
        String number3 = in.next();
        String number4 = in.next();
        String number5 = in.next();
        String number6 = in.next();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        int num4 = Integer.parseInt(number4);
        int num5 = Integer.parseInt(number5);
        int num6 = Integer.parseInt(number6);

        int second = (num4*3600 + num5*60 + num6 - num1*3600 - num2*60 - num3);
        int minutes=(num4*60+num5-num1*60-num2);
        int seconds=(num6-num3);
        if( second < 0 ){
           return;
        }
        if (second>24*3600) {
            return;
        }
        if (second>0 && seconds<0 && minutes-1!=0) {
            minutes -=1 ;
            seconds += 60 ;
            System.out.println(minutes+"m"+seconds+"s");
        }
        if (second>0 && seconds<0 && minutes-1==0) {
            seconds += 60 ;
            System.out.println(seconds+"s");
        }
        else if (second>0 && seconds>0) {
            System.out.println(minutes+"m"+seconds+"s");
        }
        else if (second>0 && seconds==0) {
            System.out.println(minutes+"m");
        }
        else if (second>0 && minutes==0) {
            System.out.println(seconds+"s");
        }
        else if(second == 0){
            System.out.println("0s");
        }

    }
}
