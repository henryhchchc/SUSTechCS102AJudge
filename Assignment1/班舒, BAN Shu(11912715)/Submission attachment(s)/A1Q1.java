public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        int d = Integer.parseInt(args[1]);
        if (d >= 11500000 && d < 120000000) {
            System.out.println(name + ", welcome to SUSTECH HOT POT Restraurant");
        } else {
            System.out.println(d);
        }


    }
}

