public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        int ID = Integer.parseInt(args[1]);

        if (ID >=12000000)
            System.out.printf("%s",ID);
        else if (ID <11500000)
            System.out.printf("%s",ID);
        else System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);





    }
}
