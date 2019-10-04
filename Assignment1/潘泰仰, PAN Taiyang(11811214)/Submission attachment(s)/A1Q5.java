import java.util.*;
public class A1Q5 {
    public static void main(String args[]){
        String output = "";
        for (int i = 0; i < args.length; i++) {
            double dprice = Double.parseDouble(args[i]);
            String price = String.valueOf(dprice);
            if (price.charAt(price.length() - 3) == '2'){
                dprice = dprice + 4;
                price = String.valueOf(dprice);
                output = output + price + " ";
            }else if(price.charAt(price.length() - 3) == '4'){
                dprice = dprice + 5;
                price = String.valueOf(dprice);
                output = output + price + " ";
            }
        }
        System.out.println(output);
    }
}
