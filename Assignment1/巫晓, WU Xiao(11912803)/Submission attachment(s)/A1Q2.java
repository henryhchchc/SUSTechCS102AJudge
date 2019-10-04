import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int stHour,stMin,stSec;
        int fiHour,fiMin,fiSec;
        int coMin,coSec;

        stHour = input.nextInt();
        stMin = input.nextInt();
        stSec = input.nextInt();
        fiHour = input.nextInt();
        fiMin = input.nextInt();
        fiSec = input.nextInt();
        coMin = (fiHour-stHour)*60+(fiMin-stMin);
        coSec = (fiSec-stSec);
        if(coSec < 0){
            coSec += 60;
            coMin--;
        }
        if(coMin!=0 && coSec!=0) {
            System.out.printf("%dm%ds", coMin, coSec);
        } else {
            if(coMin==0){
                System.out.printf("%ds",coSec);
            } else {
                if(coMin!=0 && coSec==0){
                    System.out.printf("%dm",coMin);
                }
            }
        }
    }
}
