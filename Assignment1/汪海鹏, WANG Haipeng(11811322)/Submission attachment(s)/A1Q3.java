import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double money = 0;
        while(in.hasNext()) {
            double p = in.nextDouble();
            double n = in.nextDouble();
            double m;
            int i = 0;
            while (n >= 1) {
                n = n - 1;
                i = i + 1;
            }
            if(n == 0.5)
            m = i * p + (n * p + 1);
            else
                 m = i*p;
            String result = String. format("%.1f",m);
            double d = Double.parseDouble(result);
            money = money + d;
        }
        System.out.printf("%.1f",money);
    }
}