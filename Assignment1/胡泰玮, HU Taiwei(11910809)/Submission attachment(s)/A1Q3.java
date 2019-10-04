import java.util.Scanner;
public class A1Q3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        double result = 0.0;
        double x= 0.0;
        while(input.hasNext()) {
            double price = input.nextDouble();
            double amount = input.nextDouble();
            int a = (int) amount;
            double xiaoshu;
            xiaoshu = amount-a;
            if(xiaoshu==0.0){
                sum =amount * price;
            }
            else{
                sum = xiaoshu*price + 1.0;
                sum = Math.round(sum);
                sum = sum+a*price;
            }
            result=result+sum;
        }
        System.out.printf("%.1f",result);


    }

}
