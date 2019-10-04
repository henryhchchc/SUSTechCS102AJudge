import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double price=0, n=0, sum=0;
        while (in.hasNext()) {
            price = in.nextDouble();
            n = in.nextDouble();
            String a= String.format("%.1f",n*price);
            sum+= Double.parseDouble(a);
            if (n%1!=0) sum+=1;
        }
        System.out.printf("%.1f",sum);
    }
}