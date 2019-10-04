import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double T = 0;
    while(in.hasNext()){
        double price = in.nextDouble();
        double N = in .nextDouble();
        if ((2*N)%2==1){
            T = T +(N-0.5)*price;
            double a=(0.5*price);
            int b= (int)Math.round(a*10);
            a = (double) b/10;
            T = T+a+1;
        }
        else
        {
            T = T+N*price;
        }
    }
        System.out.println(T);
}
 }