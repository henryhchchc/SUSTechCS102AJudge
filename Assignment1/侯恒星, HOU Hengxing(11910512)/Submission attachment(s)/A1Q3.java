import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double priceTotal = 0;
        int a = 0;
        double b = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double amount = in.nextDouble();
            if(amount%1 == 0) {
                priceTotal += amount * price;
            }
            else
            {
                a = (int) amount;
                b = price / 2;
                String str_d = String.format("%.1f", b);
                double c = Double.parseDouble(str_d);
                priceTotal += a * price + c + 1;
            }
        }
        System.out.printf("%.1f", priceTotal);
    }

}
