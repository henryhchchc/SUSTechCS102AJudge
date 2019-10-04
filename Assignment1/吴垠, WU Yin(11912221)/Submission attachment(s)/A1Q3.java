import java.util.Scanner;
public class A1Q3
{
    public static void main(String[] args)
    {
        double total=0;
        Scanner input=new Scanner(System.in);
        while (input.hasNext())
        {
            double price= input.nextDouble();
            double number=input.nextDouble();
            double halfprize = (double)Math.round(10*(price/2))/10;
            if (number%1==0.5)
            {
                total=total+price*(number-0.5)+(halfprize+1);
            }else
            {
                total=price*number+total;
            }
        }
        System.out.printf("%.1f",total);
    }
}

