import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b,sum=0.0;
            while (in.hasNext()) {
                a = in.nextDouble();
                b = in.nextDouble();
                if (b != Math.floor(b))
                    sum=(Math.floor(10*a*b+0.5))/10+sum+1;
                if (b == Math.floor(b))
                    sum = sum + (Math.floor(10*a*b+0.5))/10;
            }
                System.out.printf("%.1f", sum);
    }}
