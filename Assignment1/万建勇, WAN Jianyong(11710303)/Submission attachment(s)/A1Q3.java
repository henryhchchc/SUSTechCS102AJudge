
import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum1=0;
        float sum2=0;
        while (input.hasNextLine()) {
            float price = input.nextFloat();
            float amount = input.nextFloat();
            int decimal=0;
            {int changing=(int)amount;

                if (changing==amount) {
                    decimal = 1;
                } else {
                    decimal = 0;
                }
                if (decimal ==1){


                    sum1 = sum1+Math.round(amount*price*10)*0.1f;
                } else {


                    sum2 = sum2+Math.round((changing*price+price/2+1)*10)*0.1f;
                };
            }
        }System.out.println(sum1+sum2);
    }
}