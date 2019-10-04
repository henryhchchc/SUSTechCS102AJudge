import java.util.Scanner;


public class A1Q2{

    public static void main(String[] args){

        int seconds1, seconds2;
        int minutes1, minutes2, hours1, hours2;

        Scanner input = new Scanner(System.in);

        hours1 = input.nextInt();
        minutes1 = input.nextInt();
        seconds1 = input.nextInt();

        hours2 = input.nextInt();
        minutes2 = input.nextInt();
        seconds2 = input.nextInt();

        input.close();

        if(hours1==hours2&&minutes1==minutes2){

            System.out.printf("%ds",seconds2-seconds1);

            System.exit(0);

        }

        if(seconds1>seconds2){

            System.out.printf("%dm%ds", 60*(hours2-hours1)+minutes2-minutes1-1,seconds2-seconds1+60);

        }else if(seconds1<seconds2){

            System.out.printf("%dm%ds", 60*(hours2-hours1)+minutes2-minutes1,seconds2-seconds1);

        }else{

            System.out.printf("%dm", 60*(hours2-hours1)+minutes2-minutes1);

        }

    }

}