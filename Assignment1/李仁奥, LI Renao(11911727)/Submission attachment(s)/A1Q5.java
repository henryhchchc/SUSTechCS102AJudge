public class A1Q5 {
    public static void main(String[] args) {
        int l = args.length;
        int i = 0, s;
        double d;
        while (i < l) {
            d = Double.parseDouble(args[i]);
            s = (int) d % 10;
            if (s >= 2 & s <= 2) {
                d += 4;
                System.out.printf("%.1f ", d);
            }
            else if (s >= 4 & s <= 4) {
                d += 5;
                System.out.printf("%.1f ", d);
            }
            i++;
        }
    }
}
