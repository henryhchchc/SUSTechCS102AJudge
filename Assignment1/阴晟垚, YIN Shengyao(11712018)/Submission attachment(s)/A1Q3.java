import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double price, dish, cost, finalcost;
        finalcost = 0.0;
        while (in.hasNext()) {
            price = in.nextDouble();
            dish = in.nextDouble();

            cost = price * (dish - dish % 1) + (dish % 1) * 2 * (Math.round(price / 2 + 1) + 1);

            finalcost = finalcost + cost;

        }

        System.out.printf("%.1f", finalcost);
    }
}
