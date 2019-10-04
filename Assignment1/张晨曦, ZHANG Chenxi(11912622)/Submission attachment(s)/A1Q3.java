import java.util.Scanner;
public class A1Q3 {
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        double prise = 0;
        double numb;
        double i;
        double m;
        while(input.hasNext()) {
            double mid = input.nextDouble();
            numb = input.nextDouble();
            prise = prise + mid * (int) (numb / 1);
            i=numb - (int)(numb / 1) ;
            if (i!=0)
                prise+=Math.round(((numb - (int)(numb / 1)) * mid * 10)) / 10f + 1;
        }
        prise=Math.round(prise*10)/10f;
        System.out.printf("%.1f",prise);
    }
}
