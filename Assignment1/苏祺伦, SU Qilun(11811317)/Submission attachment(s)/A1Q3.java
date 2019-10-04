import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=0;
        while(sc.hasNext()) {
            double price = sc.nextDouble();
            double quanlity = sc.nextDouble();
            if (quanlity%1==0.5)
            {
                long y=Math.round(10*(price*quanlity+1));
                x=x+0.1*y;
            }
            else
                x += price*quanlity;
        }
        String f = String.format("%.1f",x);
        System.out.print(f);
    }
}
