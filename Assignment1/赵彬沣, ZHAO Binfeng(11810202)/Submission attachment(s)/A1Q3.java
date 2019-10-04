import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum =0.0;
        String sum2 ;
        int sum3=0;
        double number;
        double total =0.0;
        while(input.hasNext()){
            double price = input.nextDouble();
            double amount = input.nextDouble();
            if((amount*2)%2==0){
                sum=price*amount;
                number =sum;
            }
            else{
                if(amount==0.5){
                    sum =price*amount+1;
                    sum2 =String.format("%.1f",sum);
                    number = Double.parseDouble(sum2);
                }
                else{
                    sum =price*(amount-0.5)+price*0.5+1;
                    sum2 =String.format("%.1f",sum);
                    number = Double.parseDouble(sum2);
                }
            }
            total+=number;
        }
        System.out.printf("%.1f",total);
    }
}
