import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
	// write your code here
        Scanner ip=new Scanner(System.in);
        double ans=0.00;
        while(ip.hasNext()){
            double a=ip.nextDouble();
            double b=ip.nextDouble();
            if((b-(int)b)>0.3)
                ans += a * (int) b + Math.ceil(a) / 2 + 1;
            else
                ans =ans+ a * b*1.00;
        }
        System.out.printf("%.1f",ans);
    }
}
