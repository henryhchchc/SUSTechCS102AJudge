

public class A1Q1 {
    public static void main(String[] args) {
        String b = (args[0]);
        int a = Integer.parseInt(args[1]);
        if (a >= 11500000 && a <= 11999999) {
            System.out.printf("%s, Welcome to SUSTECH Hot Pot Restaurant!", b);
        } else {
            System.out.printf("%s", a);
        }
    }
}