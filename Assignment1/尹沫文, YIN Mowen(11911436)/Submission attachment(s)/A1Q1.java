public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        int idcard = Integer.parseInt(args[1]);

        name = args[0];
        idcard = Integer.parseInt(args[1]);

        if ((idcard >= 11500000) && (idcard <= 12000000))
            System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!", name);
        else
            System.out.print(idcard);

    }
}
