import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double money = 0;
        double number1;
        double money1;
        double price1;
        double money2;
        double number2;
    while (in.hasNext()) {
        double price = in.nextDouble();
        double number = in.nextDouble();
        number1 = Math.floor(number);
        money1 = number1*price;
        money1 = (double) Math.round(money1 * 10) / 10;
        price1 = price/2+1;
        number2 = number-number1;
        money2 =number2* price1*2;
        money2 = (double) Math.round(money2 * 10) / 10;
        money = money+money1+money2;
    }

    System.out.printf("%.1f", money);
    }

}