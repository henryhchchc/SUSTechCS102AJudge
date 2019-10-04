import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        double price, piece, x, halfprice = 0, all = 0;

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            price = input.nextDouble();
            piece = input.nextDouble();
            x = piece - Math.floor(piece);

            if (x == 0) {
                all += price * piece;
            } else if (x != 0) {
                halfprice = price / 2 + 1;
                all += price * Math.floor(piece) + halfprice * 1;

            }

        } System.out.printf("%.1f", all);
    }
}
