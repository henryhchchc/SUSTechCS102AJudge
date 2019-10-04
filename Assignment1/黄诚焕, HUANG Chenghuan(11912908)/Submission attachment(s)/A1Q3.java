import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result, result1=0,price1;
        while (input.hasNext()) {
            double price = input.nextDouble();
            double number = input.nextDouble();
            if ( number%1>0) {
                price1 = price * (0.5) + 1;
                if ((price1*10)%1 >=0.5){
                    price1=price1+0.1-price1%0.1;}
                result = price*(number-0.5)+price1;}
            else {result = price * number;}
            result1 = result1 + result;
        }
        System.out.printf("%.1f\n",result1);
    }
}