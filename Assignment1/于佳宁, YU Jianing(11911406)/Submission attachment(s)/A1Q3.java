import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double money,all;
        all=0;
        while(in.hasNext()){
            double price=in.nextDouble();
            double amount=in.nextDouble();
            double a=(int)amount;
            double b= (a-amount);
            double c=(price/2+1);
            c=Math.round(c);
            if(b==0){money=amount*price;
                all=all+money;}
            else {
                money=a*price+c;
                all=all+money;}
            }
        System.out.printf("%.1f",all);

    }
}