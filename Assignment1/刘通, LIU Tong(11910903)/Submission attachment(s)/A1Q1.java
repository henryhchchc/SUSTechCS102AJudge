public class A1Q1 {
    public static void main(String[] args) {
        String na = args[0];
        String re = args[1];
        if (re.length()!=8) {
            System.out.print(re);
            System.exit(0);
        }
        if (Integer.valueOf(re.substring(0,3)) < 115 || Integer.valueOf(re.substring(0,3)) > 119) {
            System.out.print(re);
            System.exit(0);
        }
        System.out.print(na);
        System.out.print(", welcome to SUSTECH Hot Pot Restaurant!");
    }
}
