

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        //input and calculate each price
        double sum=0;
        while(input.hasNext())      //only when Ctrl+D (Ctrl+Z in cmd) does it stop while.
        {
            double a=input.nextDouble();              //input each price
            double b=input.nextDouble();

            //calculate c, the price for one kind of food
            double c;
            if(b%1==0)
            {
                c=a*b;
            }
            else
            {
                c=a*b+1;
            }
            c=Math.round(c*10)/10.0;

            //add it to sum
            sum+=c;
        }//end calculate sum

        //output
        System.out.printf("%.1f",sum);
    }//end main
}
