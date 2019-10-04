import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 0;
        float n;
        while (in.hasNext()){
            double price = in.nextDouble();
            double price2 = price / 2 + 1;
            String Str_p2 = String.format("%.1f", price2);
            double p2 = Double.parseDouble(Str_p2);
            n = in.nextFloat();
            float m = n % 1;
            sum = price * (n-m) + p2 * 2 * m + sum;
        }
        System.out.printf("%.1f", sum);
    }
}
