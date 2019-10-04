import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args) {
        double price1 =0 ,price2 = 0;
        for(int i = 0; i < args.length; i++) {
            System.out.println(i);
            price1 = Double.parseDouble(args[i]);
        }
        for(int i = 0; i < args.length; i++){
            System.out.println(i);
            price1 = Double.parseDouble(args[i]);
        }
        if((price1 - 2) % 10 == 0){
            price2 = price1 - 2 + 6;
            System.out.print(price2+" ");
        } else if ((price1 - 4) % 10 == 0){
            price2 = price1 - 4 + 9;
            System.out.print(price2+" ");
        }

    }


}


