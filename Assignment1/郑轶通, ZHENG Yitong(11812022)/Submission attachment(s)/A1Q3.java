import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Q3{
    public static void main(String[] args){
        double total = 0;
        Scanner input = new Scanner(System.in);
        double price = 0;
        double copies = 0;
        while (input.hasNext()){
             price = input.nextDouble();
             copies = input.nextDouble();
            if ((2 * copies) % 2 == 0){
                total = total + price * copies;
            }
            else {
                double integer = (copies * 2 - 1)/2;
                total = total +(integer * price)+1+ (double)Math.round(((price/2)*10)/10)  ;
            }
        }

        System.out.printf("%.1f",total);
    }
}