import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, amount, money ;
        double sum = 0;
        while(input.hasNext()){
            price = input.nextDouble();
            amount  = input.nextDouble();
            if(amount%1==0){
                money=price*amount;
            }else {
                money = price * ((int) amount / 1) + (price / 2 + 1);
            }
                sum=sum+money;
                sum = (double) Math.round(sum * 10) / 10;
            }




        System.out.printf("%.1f",sum);

    }
}
