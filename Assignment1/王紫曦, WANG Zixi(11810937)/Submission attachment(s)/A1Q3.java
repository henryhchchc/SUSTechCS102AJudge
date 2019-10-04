import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=0;
        while(in.hasNext()){
        double price=in.nextDouble();
        double number=in.nextDouble();
        double dishPrice=0;
        if(number%1==0){
            dishPrice=price*number; }
       else if(number%1!=0){
            double halfPrice=Math.round(price/2+1);
            dishPrice=halfPrice+price*(number-0.5);}
       sum+=dishPrice;
        }
        System.out.printf("%.1f",sum);
    }
}
