import  java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price ,amount,sum = 0,total = 0;
        while (in.hasNext())
        {price = in.nextDouble();
            amount = in.nextDouble();
            if (amount != (int)amount)
                sum = price * (int)amount + price/2 + 1;
            else sum = price * amount;
        total += sum;

        }
        total = total *10;
        Math.round(total);
        total = total/10;
        System.out.println(total);
    }
}