

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double whole = 0;
        double prices;
        String result ;
        while(in.hasNext()){
            String str = in.nextLine();
            String a[] =str.split(" ");
            double price=Double.parseDouble(a[0]);
            double number1=Double.parseDouble(a[1]);
             int number2=(int)number1;
            if(number1==number2){
                prices = number1*price;
                result = String .format("%.1f",prices);
                prices=Double.parseDouble(result);
                 whole+=prices;}
            else {
                prices=number1*price+1 ;
                result = String .format("%.1f",prices);
                prices=Double.parseDouble(result);
                whole+=prices;

            }
            result = String .format("%.1f",whole);
            if(in.hasNext());
                else System.out.println(result);
        }

    }
}
