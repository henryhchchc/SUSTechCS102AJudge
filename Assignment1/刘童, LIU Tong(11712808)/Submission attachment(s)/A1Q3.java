import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        double P=0;
        while (in.hasNext()) {

            double price = in.nextDouble();
            double amount = in.nextDouble();

            if (2 * amount % 2 == 1)
            {double hp=price/2+1;
               hp= Math.round(hp*10)*0.1d;
               P = P + price*(amount-0.5)+hp;}
            else
                P=P+price*amount;
        }
        System.out.print(P);
    }
}
