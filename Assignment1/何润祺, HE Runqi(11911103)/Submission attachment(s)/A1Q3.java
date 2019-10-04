import java.util.Scanner;
public class A1Q3{
    public static void main(String[] args){
        int i;
        double price;
        double amount;
        double sum1=0;
        double sum2=0;

        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            price = in.nextDouble();
            amount = in.nextDouble();
            i = (int) amount;
            sum1 = ((price / 2) + 1)*(amount-i) *2 + price * i;
            Math.round(sum1);
            String w1=String.format("%.1f",sum1);
            double w2=Double.parseDouble(w1);
            sum2=sum2+w2;

            }
        System.out.printf("%.1f",sum2);}}

