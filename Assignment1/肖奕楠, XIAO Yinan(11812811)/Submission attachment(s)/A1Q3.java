import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        while (in.hasNext()) {
            double price = in.nextDouble();
            double count = in.nextDouble();
            if (count % 1 == 0.0) {
                total += price * count;
            } else {
                total += price*(Math.floor(count))+Math.round(price/2)+1;
            }
        }
        System.out.printf("%.1f",total);
    }
}
