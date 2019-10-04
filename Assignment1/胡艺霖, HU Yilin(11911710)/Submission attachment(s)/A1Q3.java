import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double sum,money;
        sum=0;
        while (a.hasNext()) {
            double price = a.nextDouble();
            double piece = a.nextDouble();
            double b = (int) piece;
            double c = piece- b;
            if (c == 0){
               money=price * piece;
               sum=sum + money;
           }
            else
            {money= price * b + Math.round(price / 2 + 1);
            sum = sum+money;}

        }
    System.out.printf("%.1f",sum);
   }
}