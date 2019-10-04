
import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        double output=0.0;
        while(input.hasNext()){
            double price = input.nextDouble();
            double copy = input.nextDouble();
            int number1 = (int)Math.floor(copy);
            double number2 = copy - number1;
            double number3;
            if(number2==0.0){
                number3=0;
            }else{
                number3 = number2*price+1;
            }
            int number4 = (int)Math.floor(number3*10);
            double number5 = number3*10-number4;
            double number6 = 0.0;
            if(number5==0.0){
                number6=number3;
            }else if(number5==0.5){
                number6=number3+0.05;
            }
            double money = number6 + (price * number1);
            output = output+money;
        }
        System.out.printf("%.1f",output);

    }
}
