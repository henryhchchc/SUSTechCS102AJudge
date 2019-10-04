import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price=0;
        while (input.hasNext()) {
            double object = input.nextDouble();
            double quantity = input.nextDouble();
            int quantity1 = (int) quantity;
            double quantity2 = quantity - quantity1;
            if (quantity2 == 0) {
                price+= Math.round(object * quantity1 * 10) / 10f;
            } else {
                price+= Math.round((object * quantity1 + object / 2 + 1) * 10) / 10f;
            }
        }
        System.out.printf("%.1f", price);
    }
}
