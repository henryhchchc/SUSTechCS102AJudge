import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1= in.nextInt();
        int number2= in.nextInt();
        int number3= in.nextInt();
        int number4= in.nextInt();
        int number5= in.nextInt();
        int number6= in.nextInt();
        int number7;
        int number8;
        int number9;
        int minute ;
        int second ;


        System.out.printf("%2d %2d %2d\n",number1,number2,number3);
        System.out.printf("%2d %2d %2d\n",number4,number5,number6);

        number7= number4-number1;
        number8= number5-number2;
        number9= number6-number3;
        minute= number7*60+number8;
        second= number9;

        if((minute>0)&&(second>0))
        System.out.printf("%2dm%2ds",minute,second);
        else if((second>0))
        System.out.printf("%2ds",second);
        else if((minute>0))
            System.out.printf("%2dm",minute);
        else
            System.out.print("0s");




    }
}
