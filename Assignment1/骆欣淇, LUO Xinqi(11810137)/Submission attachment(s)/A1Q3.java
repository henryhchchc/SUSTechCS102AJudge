package javaa;

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        while(sc.hasNext()){
            double price = sc.nextDouble();
            double number = sc.nextDouble();
            if(number % 1 == 0.5){
                sum = sum + price*(number-0.5)+Math.round(price*5+10)/10;
            }
            else
                sum = sum + price*number;
        }
        System.out.printf("%.1f",sum);
    }
}
