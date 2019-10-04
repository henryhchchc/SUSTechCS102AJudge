import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double total = 0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double amount = in.nextDouble();
            int a = (int) Math.round(amount);
            int b = (int) Math.floor(amount);
            int c = (int)Math.round(price);
            double d;
            if (a - b == 0)
                d = price * amount;
            else d = b* price +(amount-b)*c+ 1;
            total += d;
        }System.out.printf("%.1f\n", total);
    }}

