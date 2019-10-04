import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        int hour1, minute1, second1;
        int hour2, minute2, second2;
        int hour3, minute3, second3;

        Scanner input = new Scanner(System.in);
        hour1 = input.nextInt(); minute1 = input.nextInt(); second1 = input.nextInt();
        hour2 = input.nextInt(); minute2 = input.nextInt(); second2 = input.nextInt();
        hour3 = hour2-hour1; minute3 = minute2-minute1; second3 = second2-second1;
        minute3+= hour3*60;

        while (second3 <0){
            second3+=60; minute3--;
        }

        if(minute3 != 0)
            System.out.printf("%dm",minute3);
        if (second3 !=0)
            System.out.printf("%ds",second3);
        if (minute3 == 0 & second3 == 0)
            System.out.printf("0s");

    }
}
