import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      double c;double sum=0;
            while (in.hasNext()) {
                double price = in.nextDouble();
                double a = in.nextDouble();
                double b = a - ((a * 10) % 10) / 10;

                if (a > b) {
                    c = b * price + (price / 2 + 1); }
                else {
                    c = a * price; }
                String str_c = String.format("%.1f",c);
                double c2 = Double.parseDouble(str_c);
                sum=sum+c2;
            } System.out.printf("%.1f",sum);

    }
}
