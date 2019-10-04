import java.math.BigDecimal;
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=0,sum1=0,sum2=0, x=0,z=0,y=0,k=0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double amount = in.nextDouble();
            if (amount % 1 != 0) {
                y=price/2;
                BigDecimal bd = new BigDecimal(Double.toString(y));
                k=bd.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
                sum1 = price * (amount - 0.5) + k+1;
                x += sum1;


            } else {

                sum2 = price * amount;
                z+=sum2;
            }
        }
        sum=x+z;

        System.out.println(String.format("%.1f", sum));


    }
}
