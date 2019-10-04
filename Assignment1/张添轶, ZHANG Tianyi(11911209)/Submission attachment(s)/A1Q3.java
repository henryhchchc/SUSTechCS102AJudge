import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        double a,b,c = 0.0,sum = 0.0;
        while(ip.hasNext())
        {
            a = ip.nextFloat();
            b = ip.nextFloat();
            while(b>=1){
                c+=a;
                b--;
            }
            if(b==0.5){
                c+=(a/2+1);
                sum += 0.05;
            }
            sum =sum + c ;
            c = 0;
        }
        System.out.printf("%.1f",sum);
    }
}