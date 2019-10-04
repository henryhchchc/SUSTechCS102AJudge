import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double item, piece;

        while (in.hasNext()) {
            item = in.nextDouble();
            piece = in.nextDouble();
            if (piece - (int)piece > 0) {
                price += item * piece + 1;
           //     System.out.println(price);
            } else {
                price += item * piece;
            //    System.out.println(price);
            }
        }
        System.out.printf("%.1f",price);
// 49.9 1
// 9.9 2
// 29.9 0.5
// 59.9 1.5
    }
}
