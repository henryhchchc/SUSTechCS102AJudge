import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double amount = in.nextDouble();
            int t1 = (int)(amount * 10);
            int t = t1 / 10;
            double p = (double)Math.round((price*5)/10);
            if(amount == t)
                a = a + price * amount;
            else{
                a = a + price * t + p + 1;}
        }
        System.out.printf("%.1f",a);
    }
}