import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float price;
        float n;
        float total= 0;
        int hp;

        while(in.hasNext())
        {
            price = in.nextFloat();
            n = in.nextFloat();
            if (n % 1 != 0) {
                int a = (int) n;
                if (10 * price % 10 >= 5)
                    hp = (int) (price + 1) / 2 + 1;
                else
                    hp = (int) price / 2 + 1;
                total =total + a * price + hp;}
            else
                total = total + n * price;
        }
        System.out.printf("%.1f",total);
    }
        }

