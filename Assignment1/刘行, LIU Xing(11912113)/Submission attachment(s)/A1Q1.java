public class A1Q1 {
    public static void main(String[] args){

        String a = args[0];
        int id = Integer.parseInt(args[1]);
        if (id > 11500000 && id < 11999999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", a);
        else
            System.out.print(id);
    }
}