
import java.util.*;
public class A1Q3 {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  double m;
  double total = 0;

  while (in.hasNext()) {
   double price = in.nextDouble();
   double num = in.nextDouble();
   if (num % 1 != 0) {
    m = price * (int) num + Math.ceil(price / 2) + 1;
   } else {
    m = price * num;

   }
   total = total + m;
  }

  System.out.printf("%.1f\n", total);
  in.close();
 }
}