import javax.swing.*;
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double amount = in.nextDouble();
            double b = amount*10%10;
            double c = price*amount;
            double d = c*100%10;
            if(b==0&&d==0){
               sum= sum+c;

            }else if(b==5&&d>=5){
                c = c + (10-d)*0.01;
                        sum=sum+c+1;

            }


        }System.out.printf("%.1f\n",sum);


    }
}



