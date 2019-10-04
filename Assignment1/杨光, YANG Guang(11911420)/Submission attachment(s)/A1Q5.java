public class A1Q5 {

    public static void main(String[] args) {
        int i = 0;
        int len = args.length;
        while (i < len) {
            String a = args[i];
            Double b = new Double(a);
            i++;
            if (Math.floor(b) % 10 == 2) {
                b = b + 4;
                System.out.printf("%.1f ", b);
            } else if (Math.floor(b) % 10 == 4) {
                b = b + 5;
                System.out.printf("%.1f ", b);
            }
        }
    }
}
