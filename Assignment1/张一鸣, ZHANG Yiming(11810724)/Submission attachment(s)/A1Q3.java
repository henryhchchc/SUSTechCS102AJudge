import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double price,amount;
        double money;
        double total = 0;

        while (in.hasNext()) {
                price = in.nextDouble();
                amount = in.nextDouble();

                double a = amount - (int) amount;
                double b = price*5;
                double c = b - (int)b;
                double d;
                if (c>=0.5){
                    d = price/2+0.05;}
                else d = price/2;

                if (a > 0){
                    money = (amount - 0.5) *price+ d + 1;
                 total = total + money;}
                else {money = amount * price;
                total = total + money;}
        }
        System.out.printf("%.1f",total);
    }
}