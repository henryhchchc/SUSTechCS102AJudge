import java.util.Scanner;
public class  A1Q3{
    public static void main(String[] args) {
        double y=0;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            double price = in.nextDouble();
            double x = in.nextDouble();
            int b =(int)(x*2);
            if(x%1==0) {
                y = y+price*x;
            }
            else {
                b=b-1;
                y= y+ price*b/2;
                double z= price/2;
                y=y+(double)Math.round(z*10)/10+1;
            }
        }
        System.out.printf("%.1f", y);
    }
}