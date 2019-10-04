import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        double x[] = new double[8];
        Scanner sc = new Scanner(System.in);
        double sum=0;
        for(int j =0 ; j<8;j++) {
            x[j] = sc.nextDouble();
        }

        for(int i=0; i<8; i++) {

            if( i%2 !=0){
                if( x[i] % 1> 0){
                    double zhengshu = x[i]-x[i]%1;
                    double m = x[i-1]/2 +1;
                    double c = m * 10;
                    c =  Math.round(c);
                    c = c/10;

                    sum = sum + x[i-1]*zhengshu + c;

                } else {
                    sum = sum + x[i-1]* x[i];


                }



            }

        }
        System.out.printf("%.1f",sum);






    }
}
