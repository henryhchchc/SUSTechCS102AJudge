import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double P;
        double sum = 0;
        while (input.hasNext()) {
            double price = input.nextDouble();
            double num = input.nextDouble();
            if (num * 2 % 2 == 0) {
                P = price * num;
                String s = String.format("%.1f", P);
                P = Double.parseDouble(s);
                sum += P;
            } else {
                P = price * num + 1;
                String s = String.format("%.1f", P);
                P = Double.parseDouble(s);
                sum += P;
            }

        }
        System.out.printf("%.1f", sum);
    }

}
