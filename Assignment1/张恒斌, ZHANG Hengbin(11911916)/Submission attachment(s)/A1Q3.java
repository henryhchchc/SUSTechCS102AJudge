import java.util.Scanner;
import java.lang.Math;
public class A1Q3 {
    public static void main(String[] args){
        double price = 0;
        double wholePrice = 0;
        double amount = 0;
        double a;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            price = in.nextDouble();
            amount = in.nextDouble();
            if(amount%1==0){
                wholePrice += price*amount;
            }
            else if(amount%1!=0){
                wholePrice += price*amount + 1;

                wholePrice = (double) (((int)Math.round((wholePrice)*10000))/10000.0);
                wholePrice = (double) (((int)Math.round((wholePrice)*1000))/1000.0);
                wholePrice = (double) (((int)Math.round((wholePrice)*100))/100.0);
                wholePrice = (double) (((int)Math.round((wholePrice)*10))/10.0);
            }

        }
        System.out.println(wholePrice);

    }
}
