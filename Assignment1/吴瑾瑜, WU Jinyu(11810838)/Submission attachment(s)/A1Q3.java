import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        double sum=0;

        while(in.hasNext()) {
            double price = in.nextDouble();
            double number = in.nextDouble();
            double price2=0;
            String result=null;
            double price3=0;
            if (number%1==0.5) {
                price2 = price / 2 + 1;
                result=String.format("%.1f",price2);
                price3=Double.valueOf(result);
                number=number-0.5;
            }
            sum=sum+price3+price*number;

        }
        System.out.println(sum);

        }


    }
