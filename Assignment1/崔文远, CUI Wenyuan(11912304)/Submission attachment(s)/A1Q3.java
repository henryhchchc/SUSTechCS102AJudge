
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double sum;
        sum=0;
        while(input.hasNext()) {
            double price = input.nextDouble();
            double n=input.nextDouble();
            if (n/0.5%2==0){
                sum=sum+(n*price) ;
            }
            else{
                sum=sum+Math.round(n*price*10)/10.0+1;
            }
        }
        System.out.printf("%.1f",sum);

    }
}