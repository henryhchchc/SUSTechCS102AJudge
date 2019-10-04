import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double p=0;
        double P=0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double m = in.nextDouble();
            if (m / Math.ceil(m) == 1)
                p = price * m;
            else
                p = price * Math.floor(m) + Math.ceil(price / 2 + 1);
            P+=p;
        }
            System.out.printf("%.1f",P);
    }
}
