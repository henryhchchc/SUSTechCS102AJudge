public class A1Q5 {
    public static void main(String[] args) {
        float[] a = new float[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Float.parseFloat(args[i]); }
        for (int i = 0;i < args.length; i ++) {
            double price = a[i];
            int unit = (int)price%10;
            if (unit == 2) {
                price = price + 4;
                System.out.printf("%.1f ", price); }
            if (unit == 4) {
                price = price - 4 + 9;
                System.out.printf("%.1f ", price);
            }
        }
    }
}


