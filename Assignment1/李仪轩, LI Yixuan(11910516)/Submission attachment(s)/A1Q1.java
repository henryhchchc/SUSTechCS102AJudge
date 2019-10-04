public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        String id = args[1];
        int md = id.length();
        String cd = id.substring(0,3);
        int cd1 = Integer.parseInt(cd);
        if (cd1 < 115 || cd1 > 119 || md != 8)
            System.out.print(id);
        else
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
    }
}