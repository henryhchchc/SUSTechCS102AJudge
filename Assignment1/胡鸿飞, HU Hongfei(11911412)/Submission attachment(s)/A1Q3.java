import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
        double sum,total,amount1;
        sum = 0;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            double price = in.nextDouble();
            double amount = in.nextDouble();
            double judge = amount / 0.5;
            if ((int)judge %2 == 0) {
                total = price * amount;
                sum = sum + total;}
            else{
                amount = amount - 0.5;
                amount1 = price /2+1;
                amount1=Math.round(amount1);
                total = price * amount + amount1;
                sum = sum + total;}

            }
        System.out.printf("%.1f",sum);
        }

    }

