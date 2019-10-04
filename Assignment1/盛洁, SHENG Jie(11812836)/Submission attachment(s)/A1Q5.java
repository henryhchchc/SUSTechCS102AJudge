package Assignment;

public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        int i = 0;
        while (i < length) {
            float price = Float.parseFloat(args[i]);
            int p = (int) price;
            int unit2 = (p - 2) / 10;
            float u2 = (float) (p - 2) / 10;
            int unit4 = (p - 4) / 10;
            float u3 = (float)(p - 4) / 10;
            i++;
            if (u2 == unit2) {
                price = price + 4;
                System.out.printf("%.1f ", price);
            } else if (u3 == unit4) {
                price = price + 5;
                System.out.printf("%.1f ", price);
            }
        }
    }
}

