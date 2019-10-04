import java.util.Scanner;

public class A1Q3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double price, num, sum;
        String round;

        sum = 0;

        while(in.hasNext()){

            price = in.nextDouble();
            num = in.nextDouble();

            if(num%1 == 0)
                sum += price*num;
            else if(num%1 == 0.5)
                sum += ((int)num)*price+price/2+1;
            else{
                System.out.println("Wrong number of dishes!");
                in.close();
                return;
            }

            round = String.format("%.1f", sum);
            sum = Double.parseDouble(round);

        }

        System.out.printf("%.1f", sum);

        in.close();

    }

}