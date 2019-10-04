

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class A1Q3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double sum=0;
        DecimalFormat DF = new DecimalFormat("0.0");
        DF.setRoundingMode(RoundingMode.CEILING);
        while(input.hasNext()){
            double price = input.nextDouble();
            double num = input.nextDouble();
            if((num-Math.floor(num))==0){sum = sum + price*num;}
            else{sum=sum + Double.parseDouble(DF.format((price /2+1)))+ price*Math.floor(num);}
        }
        System.out.print(sum);
    }
}
