import java.util.*;
public class A1Q3 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        double total_price = 0;
        while(in.hasNext()){
            double price  = in.nextDouble();
            double pts = in.nextDouble();
            total_price = total_price + Math.floor(pts)*price;
            if((pts-Math.floor(pts))!=0){
                double half = Math.round(price*10/2)/10 + 1;
                total_price = total_price + half;
            }
        }
        System.out.println(total_price);
    }
}
