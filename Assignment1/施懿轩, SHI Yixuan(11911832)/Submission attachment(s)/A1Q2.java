
import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour1,minute1,second1;
        hour1=input.nextInt();
        minute1=input.nextInt();
        second1=input.nextInt();
        int hour2,minute2,second2;
        hour2=input.nextInt();
        minute2=input.nextInt();
        second2=input.nextInt();

        int number1,number2;
        number1=(hour2-hour1)*60+(minute2-minute1);
        number2=second2-second1;
        if(number2>=0){
            if(number1==0){
                System.out.printf("%d"+"s",number2);
            }else {
                if (number2 == 0) {
                    System.out.printf("%d" + "m", number1);
                } else {
                    System.out.printf("%d" + "m" + "%d" + "s", number1, number2);
                }
            }
        }else{
            number1=number1-1;
            number2=number2+60;
            if(number1==0){
                System.out.printf("%d"+"s",number2);
            }else {
                if (number2 == 0) {
                    System.out.printf("%d" + "m", number1);
                } else {
                    System.out.printf("%d" + "m" + "%d" + "s", number1, number2);
                }
            }


        }



    }
}
