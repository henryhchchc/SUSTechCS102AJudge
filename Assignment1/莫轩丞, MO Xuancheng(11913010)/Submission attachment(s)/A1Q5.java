public class A1Q5 {
    public static void main(String[] args) {
        double prices;
        int times = 0;
        int number = args.length;

        for (times = 0; times < number; times++) {
            double price = Double.parseDouble(args[times]);
            double gewei = price % 10;
            gewei = Math.floor(gewei);

            if (gewei == 2) {
                price = price + 4;
                prices = price;
                System.out.print(prices + " ");
            }
            if (gewei == 4) {
                price = price + 5;
                prices = price;
                System.out.print(prices + " ");
            }
        }
    }
}