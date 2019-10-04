public class A1Q5 {
    public static void main(String[] args) {
        int i = 0;
        int n = args.length;
        while (i < n) {
           float a = Float.parseFloat(args[i]);
           float b = (float) Math.floor(a) - 10 * ((float) Math.floor(a / 10));
            if (b == 2) {
                a = a - 2 + 6;
                System.out.printf("%s ",a);
            }
            if (b == 4) {
                a = a - 4 + 9;
                System.out.printf("%s ",a);}
                i++;
            }
        }
    }
