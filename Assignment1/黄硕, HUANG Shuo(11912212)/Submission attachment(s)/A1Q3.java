import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c;
        c=0;
        while(input.hasNext()){
        a=input.nextDouble();
        b=input.nextDouble();
                if (b % 1 == 0)
                {
                    c += a * b;
                }
               else
                   {
                   c+=Math.round((a*b+1)*10)*0.1;
            }
        }
        System.out.printf("%.1f",c);
    }
}
