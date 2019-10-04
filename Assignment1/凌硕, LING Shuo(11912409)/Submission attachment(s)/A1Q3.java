import java.math.BigDecimal;
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
       double a;double b;double c;
       c=0.0;
       while(input.hasNext()) {
           a = input.nextDouble();
           b = input.nextDouble();
           if (b - Math.floor(b) == 0.5) {
               b = Math.floor(b);
               c = (a * b) + (a * 0.5) + 1 + c;
               c = 10 * c;
               c = Math.round(c);
               c = c / 10;
           }
           else {
               c = (a * b) + c;
           }
       } //while
       System.out.printf(" %.1f",c);
    }
}
