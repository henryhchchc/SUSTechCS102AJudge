public class A1Q1 {
    public static void main(String[] args) {
        String a;
        a = args[0];
        int b;
        b = Integer.parseInt(args[1]);
        if (b >= 12000000 | b <= 11500000) {
            System.out.printf("%d", b);
        } else {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", a);

        }

    }

}



