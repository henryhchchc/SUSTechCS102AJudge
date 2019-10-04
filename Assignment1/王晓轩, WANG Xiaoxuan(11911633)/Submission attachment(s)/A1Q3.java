import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        double total=0;
        Scanner input=new Scanner(System.in);
        while(input.hasNext()) {
            double price = input.nextDouble();
            double t = input.nextDouble();
            int n = 0;
            while (t > 0.5) {
                t = t - 1;
                n++;
            }
            if (t==0.5) {
                total = total + price * n + Math.round(price * t + 1);
            } else {
                total = total + price * n;
            }
        }
        System.out.println(total);
    }
}
