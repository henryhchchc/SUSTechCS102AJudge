import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0.0d;
        while (input.hasNext()) {
            double price = input.nextDouble();
            double need = input.nextDouble();
            a = price * need + a;
            if (need!=(int)need)
                a=a+1;
            if (100*a%10<=4)
                a=((int)10a)/10;
            else
            a=((int)10a)/10+0.1;
        }
        System.out.printf("%.1f", a);
    }
}