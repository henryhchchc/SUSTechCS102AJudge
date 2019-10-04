import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double cost;
        double h;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double number = in.nextDouble();
            h = price/2+1;
            float i = Math.round((h*10)/10);
            if (number%1!=0) {
                cost = price*(number-0.5)+i; }
            else {
                cost = price * number; }
            sum = sum +cost;
        }
        System.out.printf("%.1f",sum);
    }
}
