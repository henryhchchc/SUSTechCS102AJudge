import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum=0;
        int pricechange;

        while (input.hasNext()){
            double price = input.nextDouble();
            double many = input.nextDouble();
            if (many != (int)many){
                pricechange = (int)((price/2)*10);
                if (pricechange%10 >=5) pricechange+=10;
                pricechange/=10; pricechange++;
                sum+=pricechange;
            }//sum+=Math.round(price/2+1);
            sum+=(int)many*price;
        }
        System.out.printf("%.1f\n",sum);
    }
}
