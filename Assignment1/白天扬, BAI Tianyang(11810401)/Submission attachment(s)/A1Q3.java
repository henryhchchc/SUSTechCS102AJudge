import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        double total=0.0;
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            double price = in.nextDouble();
            double x = in.nextDouble();
            if(x == (int)x){
                total += price*x;
            }
            else{
                double half = Math.round(price*10/2)/10;
                total += price*(x-0.5)+half+1;
            }
        }
        System.out.printf("%.1f",total);
    }
}