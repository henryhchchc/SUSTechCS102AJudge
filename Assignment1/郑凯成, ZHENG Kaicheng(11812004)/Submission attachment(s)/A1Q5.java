public class A1Q5 {
    public static void main(String[] args) {
        int i = 0;
        int length = args.length;
        while (i< length) {
            double a = Double.parseDouble(args[i]);
            double b = a % 1;
            double c = a - b;
            double d = c % 10;
            double e = c - d;
            if (d == 2) {
                d = 6;
                System.out.printf("%s ",e+b+d); }
            if (d == 4) {
                d = 9;
                System.out.printf("%s ",e+b+d); }
            i++;
        }
    }
}