public class A1Q5 {
    public static void main(String[] args) {
        double[] a = new double[args.length];
        int i;
        double b;
        for (i = 0; i < args.length; i++) {
            a[i] = Double.parseDouble(args[i]);
            b = a[i] % 10;
            int c = (int)b;
            if (c == 2) {
                a[i] = a[i] + 4;
                System.out.print(a[i]);
                System.out.print(" ");
            }
            if (c == 4) {
                a[i] = a[i] + 5;
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
    }
}
