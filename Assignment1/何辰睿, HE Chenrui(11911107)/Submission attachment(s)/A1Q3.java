import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sum = 0,money = 0;
        double b;
        int a;

        while (input.hasNext()){
            double price = input.nextDouble();
            double number = input.nextDouble();
            a = (int)(number / 1);
            b = number - a;
            String P = "";
            if (b == 0){
                sum = price * a;
                money += sum;
            }
            if(b != 0){
                P = String.format("%.1f",price/2 + 1);
                double p = Double.parseDouble(P);
                sum = p + price * a;
                money += sum;
            }

        }

        System.out.printf("%.1f",money);
    }


}
