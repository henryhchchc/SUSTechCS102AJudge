public class A1Q1 {
    public static void main(String[] args) {
        String name=args[0];
        String id=args[1];
        int x=id.length();
        String s=id.substring(0,3);
        int b = Integer.parseInt(s);
        if (x!=8 || b<115 || b>119)
            System.out.println(id);
        else
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
    }
}