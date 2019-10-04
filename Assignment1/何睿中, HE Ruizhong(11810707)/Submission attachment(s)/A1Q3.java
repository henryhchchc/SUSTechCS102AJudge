import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double allprice=0;
        while(in.hasNext()){
            float price = in.nextFloat();
            double amount = in.nextDouble();
            if(amount%1==0){
            allprice = price*amount+allprice;
            }
            else{
                allprice=price*(Math.floor(amount))+Math.rint(price/2+1)+allprice;
            }
        }
        System.out.printf("%.1f",allprice);

    }
}
