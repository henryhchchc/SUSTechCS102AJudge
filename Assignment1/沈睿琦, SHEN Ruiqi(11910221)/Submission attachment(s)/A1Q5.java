public class A1Q5 {
    public static void main(String[] args) {
        for (int n = 1; n <= args.length; n++) {
            double a = Double.parseDouble(args[n - 1]);
            double b;
            b = Math.floor(a);
            if ((b - 2) % 10 == 0) {
                double c = a + 4;
                System.out.printf(" %.1f",c);
            } else if ((b - 4) % 10 == 0) {
                double c = a + 5;
                System.out.printf(" %.1f",c);
            }
        }
    }
}