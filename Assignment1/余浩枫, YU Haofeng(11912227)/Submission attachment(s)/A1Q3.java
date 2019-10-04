import java.util.Scanner;

public class A1Q3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        double money,total;
        total=0;
        while(in.hasNext()){
            double price=in.nextDouble();
            double amount=in.nextDouble();
            double a=(int)amount;
            double b=amount-a;
            if(b==0){
                money=amount*price;
                total=total+money; }
            else{
                money=a*price+(Math.round(price/2))+1;
            total=total+money;}
        }
        System.out.printf("%.1f",total);
    }
}
