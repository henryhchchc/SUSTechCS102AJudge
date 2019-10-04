
import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
        int hour1, minute1, second1, hour2, minute2, second2, minute3, second3;

	    //creating object of Scanner class
        Scanner input = new Scanner(System.in);
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        second1 = input.nextInt();
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        second2 = input.nextInt();
        minute3 = (hour2 - hour1) * 60 + minute2 -minute1;
        second3 = second2 - second1;
        if(second1 > second2){
            second3 += 60;
            minute3 -= 1;
        }
        else {

        }
        if(minute3 == 0& second3 != 0){
            System.out.printf("%ss", second3);
        } else if(second3 ==0& minute3 != 0){
            System.out.printf("%sm", minute3);
               }else if(second3 == 0& minute3 == 0){
            System.out.printf("%ss", second3);
                     }else{
            System.out.printf("%sm%ss", minute3, second3);
                     }





    }
}
