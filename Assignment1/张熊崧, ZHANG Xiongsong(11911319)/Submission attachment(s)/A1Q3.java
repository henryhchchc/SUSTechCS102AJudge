
import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double price;
        double sum=0;
        float times;
        int a ;
        while(input.hasNext()){
            price = input.nextDouble();
            times = input.nextFloat();
            a= (int)times;
            float b = times - a;
            sum = sum + (float)Math.round((a*price + b * (price + 2))*10)/10;




        }
        System.out.printf("%.1f",sum);



    }
}
