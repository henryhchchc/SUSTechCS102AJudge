import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        while(in.hasNext()){
            double price = in.nextDouble();
            double a=in.nextDouble();
            int c= (int)Math.round(price);
           int b= (int) Math.floor(a);
           double d =b*price+(a-b)*2*((a-b)*c+1);
       total=total+d;}
        System.out.printf("%.1f\n",total);
    }}