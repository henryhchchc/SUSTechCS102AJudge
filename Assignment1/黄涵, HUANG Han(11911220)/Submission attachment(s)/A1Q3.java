import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Price = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double x = in.nextDouble();
            if(Math.abs(Math.floor(x)-x) <= 1e-6)
                Price += price*x;
            else
                Price += Math.floor(x)*price + Math.round((price)/2+1);}

            System.out.printf("%.1f",Price);

        }

    }

