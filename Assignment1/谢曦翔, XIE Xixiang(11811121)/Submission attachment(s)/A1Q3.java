import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double endPrice=0;
        while(in.hasNext()){
            double price=in.nextDouble();
            double piece=in.nextDouble();
            int p=(int)piece;
            double Price=Math.ceil(price/2);
            if(piece*2%2!=0){
               endPrice=endPrice+price*p+(Price+1);
            }else{
                endPrice=endPrice+price*piece;
            }
        }
        System.out.print(endPrice);
    }
}
