import java.math.BigDecimal;
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] price = new double[10];
        double[] number = new double[10];
        double bill=0;
        while(in.hasNext()){
            for (int i=0;in.hasNext();i++){
                if (i%2!=1){
                    price[i/2] = in.nextDouble();
                }else {
                    number[i/2] = in.nextDouble();
                }
            }
            for (int i = 0;i<=9;i++){
                double Bill;
                double yu =number[i]%1;
                int shang=(int)number[i]/1;
                if (yu!=0.5){
                    Bill = price[i]*number[i];
                }else {
                    double X = new BigDecimal(price[i]).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
                    Bill = X*shang+(0.5*X+1);
                }
                bill=bill+Bill;
            }
            System.out.printf("%.1f",bill);
        }
    }
}