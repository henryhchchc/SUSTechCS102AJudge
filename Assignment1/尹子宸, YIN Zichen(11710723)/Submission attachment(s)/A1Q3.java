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
                if (number[i]!=0.5){
                    Bill = price[i]*number[i];
                }else {
                    double X = new BigDecimal(price[i]).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
                    Bill = X*number[i];
                    double P = new BigDecimal(Bill).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
                    Bill = P+1;
                    System.out.println(Bill);
                }
                bill=bill+Bill;
            }
            System.out.printf("%.1f",bill);
        }
    }
}
//23.9 1 24.9 1 30.9 5 20.9 0.5