

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Q3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#.#");

        double total=0;
        float q=0.0f;
        int n =1;
        while (in.hasNext()){double price=in.nextDouble();
            double num=in.nextDouble();
            if (Math.floor(num/n)!=num){total=price*(Math.floor(num/n))+(price/2.0+1);}else if(num<1){
            total=price/2.0+1;
        }
        else {total=price*num;}
        q= (float) (q+total);


        }System.out.println("END");
System.out.println(decimalFormat.format(q));

    }
}