import java.util.*;

public class A3Q3 {
    public static void main(String[] args) {
        float sum =0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            float price = input.nextFloat();
            float number = input.nextFloat();
            if(number%1==0)
                sum=sum+price*number;
            else {
                sum=sum+price*number+1;
            }
            sum=sum*10;
            sum=Math.round(sum);
            sum=sum/10;
        }
        System.out.print(sum);
        // write your code here
    }
}