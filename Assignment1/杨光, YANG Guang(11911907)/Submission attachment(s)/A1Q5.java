
import java.util.Scanner;
public class A1Q5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, price;
        a = 0;
        price = 0;
        for(String s:args) {
            price =Double.parseDouble(s);
            a = price;
            if (2 < price % 10 && price % 10 < 3) {a = a + 4;
            System.out.printf("%.1f ", a);}
            if (4 < price % 10 && price % 10 < 5){ a = a + 5;
            System.out.printf("%.1f", a);}

        }
    }
}