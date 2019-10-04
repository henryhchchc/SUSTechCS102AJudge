public class A1Q1 {
    public static void main(String[]args) {
        String b=args[0];
        int a=Integer.parseInt(args[1]);
        if (11900000 <= a && a < 12000000 || 11500000 <= a && a < 11600000) {
            System.out.println(" XXX, welcome to SUSTECH Hot Pot Restaurant!");
        } else {
            System.out.println(a);
        }
    }
}