
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double sum2=0;
        while(in.hasNext()){
            double price=in.nextDouble();
            double times=in.nextDouble();
            double sum1;
            if(times-(int)times>0){
                 sum1= Math.round((price / 2 + 1) / 1) +(int)times*price;
            }
            else {
                 sum1=price*times;
        }
            sum2=sum2+sum1;
            }
       System.out.printf("%.1f",sum2);
    }}