import java.util.Scanner;

public class A1Q3 {
 public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     double price = 0;
     while (in.hasNext()) {
         double pricetemp = in.nextDouble();
         double n = in.nextDouble();
         if(n % 1==0)
             pricetemp = pricetemp * n;
         else if (n < 1)
             pricetemp = Math.round(pricetemp * 5)/10 + 1;
         else if (n > 1)
             pricetemp = pricetemp*(n-0.5) + Math.round(pricetemp*5)/10+1;
          price += pricetemp;
     }
     System.out.printf("%.1f",price);


 }
}
