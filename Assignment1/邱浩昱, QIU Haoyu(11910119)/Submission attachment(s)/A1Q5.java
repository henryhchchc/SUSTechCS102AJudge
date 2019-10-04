public class A1Q5 {
    public static void main(String[] args) {
        int length = args.length;
        double a = 0;
        for (int l = 0; l < length; l++) {
            a = Double.parseDouble(args[l]);
            if (((a * 10 - (a * 10) % 10) % 100) / 10 == 2)
                System.out.print((a + 4) + " ");

            else if (((a * 10 - (a * 10) % 10) % 100) / 10 == 4)
                System.out.print((a + 5) + " ");
        }
    }
}
