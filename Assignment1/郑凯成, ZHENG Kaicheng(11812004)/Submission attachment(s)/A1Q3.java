import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double c=0;
        double d;
        while(in.hasNext()) {
            double a = in.nextDouble();
            double b = in.nextDouble();
            if((b*10/5)%2==1)
            d= Math.round(a/2)+(b-0.5)*a+1;
            else
                d=a*b;
            c=c+d;
            }
        System.out.printf("%.1f",c);
        in.close();
        }
    }
