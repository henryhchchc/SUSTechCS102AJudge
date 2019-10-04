import java.util.Scanner;
public class A1Q3
{
    public static void main (String [] args)
    {
        float num1,num2;
        double num3,num4=0;
        Scanner in= new Scanner (System.in);
        while(in.hasNext())
        {
            num1=in.nextFloat();
            num2=in.nextFloat();
            num3=num2/0.5;
            if(num3%2==1)
            {
                num4=num4+num1*(num2-0.5)+num1/2+1;
                float num5=num1*10/2;
                if(num5%1==0.5)
                {
                    num4=num4+0.05;
                }
            }
            else
            {
                num4=num4+num1*num2;
            }
        }
        System.out.printf("%.1f",num4);


    }
}
