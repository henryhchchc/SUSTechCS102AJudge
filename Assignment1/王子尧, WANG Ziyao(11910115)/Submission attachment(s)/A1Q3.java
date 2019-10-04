import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double sum=0,percai,price,number;
        while(input.hasNext()){
            price= input.nextDouble();
            number=input.nextDouble();
            if (number%1==0)
                percai=price*number;
            else
                percai=(number-0.5)*price+(10*price+1)/20+1;
            sum=sum+percai;
        }
         System.out.printf("%.1f",sum);
    }
}
