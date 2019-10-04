//package A1;
public class A1Q5 {
    public static void main(String[] args) {
        int len = args.length;
        for (int i = 0; i < args.length; i++) {
            Double a = Double.parseDouble(args[i]);
            Double b = a % 10;
            Double c = b % 1;
            int d = (int) (b - c);
            if (d == 2) {
                System.out.print(a + 4 + " ");
            }
            if (d == 4) {
                System.out.print(a + 5 + " ");
            }


        }
    }
}