

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = 0;
        while(input.hasNext()){
            double price = input.nextDouble();
            double a = input.nextDouble();

            if(a % 1 == 0) {
                money = price * a + money;

            }
            else{
                double b = Math.round(((price / 2 + 1) * 10));
                money = price * (a - 0.5) + b / 10 + money;


            }


        } System.out.printf("%.1f ", money);




    }
}
