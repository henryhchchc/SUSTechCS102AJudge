import java.util.Scanner;

public class A1Q3 {

    public static double baoliuyiweixiaoshu(float a)
    {
        double b = Math.round(a*10)/10.0;
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sale, sum = 0, amount;
        while (input.hasNext()) {
            sale = input.nextFloat();
            amount = input.nextFloat();
            if(amount%1==0)  sum+=sale*amount;
            else sum+=sale*(amount-0.5)+baoliuyiweixiaoshu(sale/2)+1;
        }
        System.out.print(sum);
    }
}