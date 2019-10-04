package Assignment;
import java.util.Scanner;
public class A1Q3 {
    public static void main(String []args){
       float price, number, cost = 0;
        int n;

        Scanner input = new Scanner(System.in);

        while(input.hasNext()){
            price = input.nextFloat();
            number = input.nextFloat();
            n = (int) number;

            if (n == number){
                cost = cost + price*number;
            }
            else {
                cost = cost + Math.round(price/2 +1) + price*n;
            }
        }
        float c = (float) Math.round(cost*10)/10;
        System.out.printf("%.1f",c);

    }
}
