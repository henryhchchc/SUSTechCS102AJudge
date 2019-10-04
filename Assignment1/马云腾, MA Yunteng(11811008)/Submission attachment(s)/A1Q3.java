import java.util.Scanner;

public class A1Q3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double sum =0;
        double p,n;
        do {

            p = input.nextDouble();
            n = input.nextDouble();
            int nn = (int)n;
            if (nn == n) {
                sum = sum + p * n;
            }else{double a=p*nn+p/2+1;
            String result=String.format("%.1f",a);
            double b = Double.valueOf(result);
                sum = sum +b;
            }
        }
        while (input.hasNext());

        System.out.printf("%.1f",sum);
    }

}
