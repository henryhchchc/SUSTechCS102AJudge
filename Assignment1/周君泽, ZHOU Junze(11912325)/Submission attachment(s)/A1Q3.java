import java.math.BigDecimal;
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p,n,p1,sum=0,t;
        int temp;
        while (input.hasNext()){
            p = input.nextDouble();
            n = input.nextDouble();
            temp = (int) n;
            if (temp==n) sum += p*n;
            else {
                sum += p*temp;
                n = p/2+1;
                BigDecimal b = new BigDecimal(new Double(n).toString());
                p1 = b.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
                sum += p1;
            }
        }
        System.out.printf("%.1f\n",sum);
    }
}
