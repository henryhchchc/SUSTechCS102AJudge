//package A1;
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        double sum = 0;
        while(in.hasNext()){
            double a = in.nextDouble();
            double b = in.nextDouble();
            double product = 0;
            if(b % 1 == 0){
                product = a*b;
            }
            else if(b % 1 ==0.5){
                product = a*(b - 0.5) + Math.round(a*0.5*10)*0.1 + 1;
            }
            sum = sum + product;
        }
        System.out.printf("%.1f", sum);
    }
}
