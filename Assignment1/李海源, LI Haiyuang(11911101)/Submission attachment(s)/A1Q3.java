

import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        double a;int t,d;double money=0;
        while(in.hasNext()) {
            double price = in.nextDouble();
            double time = in.nextDouble();
            t = (int) time;
            d = (int) (time + 0.5);double s=price * (time - t) + 1;


            {
                if (d > t)
                    a = price * t + Math.round(s);
                else a = price * t;
            }
            money+=a;

        }
        System.out.printf("%.1f",money);





    }
}
