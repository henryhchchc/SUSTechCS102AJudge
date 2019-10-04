
import java.util.Scanner;
public class A1Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        while (in.hasNext()){
            double price = in.nextDouble();
            double amount = in.nextDouble();
            if((amount * 10) % 10 != 0){
                price = price * (int)(amount) + (int)(price + 0.5) / 2 + 1;
            }
            else {
                price = price * amount;
            }
            total += price;
        }
        System.out.printf("%.1f", total);
    }
}
