public class A1Q5 {
    public static void main(String[] args) {
        double price=0.0;
        for(int i=0;i<args.length;i++) {
            price = Double.parseDouble(args[i]);
            if ((int) price % 10 == 2) {
                price = price + 4;
                System.out.printf("%.1f ", price);
            } else if ((int) price % 10 == 4) {
                price = price + 5;
                System.out.printf("%.1f ", price);
            }
        }
    }
}
