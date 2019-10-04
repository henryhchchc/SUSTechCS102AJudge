public class A1Q1 {
    public static void main (String[] args) {
        String name = args[0];
        int s = Integer.parseInt(args[1]);
        if ( s >= 11500000 && s <= 11999999)

        System.out.printf( "%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        else
        System.out.print("The wrong id");
    }
}
