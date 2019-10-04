import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double all = 0.0;
        while(in.hasNext()){
            double prise=in.nextDouble();
            double n=in.nextDouble() ;

            if(n/((int)n)==1.0){
               all=all + prise*n;
           }
            else{
                double a = prise*5;
                double b = Math.round(a);
                all=all+b/10+1+(n-0.5)*prise;
           }
        }
        System.out.printf("%.1f",all);
    }
}


