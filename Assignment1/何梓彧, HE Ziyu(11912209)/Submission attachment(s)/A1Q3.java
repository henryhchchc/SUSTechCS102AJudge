import java.util.Scanner;

public class A1Q3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b= 0;
        while (input.hasNext()) {
            double price = input.nextDouble(), a = input.nextDouble(),c=a*price;
            String n=String.format("%.1f",c);
            double d=Double.parseDouble(n);
            b=b+d;
            if (a % 1 != 0)
                b = b + 1;
        }
        ;
        System.out.printf("%.1f", b);
    }


}
