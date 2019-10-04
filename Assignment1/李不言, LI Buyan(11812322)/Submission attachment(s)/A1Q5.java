

import java.util.Scanner;

public class A1Q5{
    public static void main(String args[]){
        double price = 0;
       for(int i = 0;i<args.length;i++){price=Double.parseDouble(args[i]);
           int price1= (int) Math.floor(price);
           if (price1%10==2){System.out.println(price+4);}else if(price1%10==4){
               System.out.println(price+5);
           }

       }
}

        }
