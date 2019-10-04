import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        double cost = 0;
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            double price = input.nextDouble();
            double number = input.nextDouble();
            if(number == (int)number){
                cost += price * number;

            }else{
                cost += (number-0.5)*price + (Math.round(price/2)+1);

            }
        }

        System.out.printf("%.1f\n",cost);






    }
}
