import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = 0, b, c, m;
        while(in.hasNext()){
            double price = in.nextDouble();
            double a = in.nextDouble();
            b = Math.floor(a);
            if (b!=a) {
                m = price * (a - b) + 1;
                String half = String.format("%.1f",m);
                double Half = Double.parseDouble(half);
                c = price * b + Half;
            }
            else {
                c=price*b;
            }
            sum=sum+c;
        }
        System.out.printf("%.1f",sum);
    }
}
