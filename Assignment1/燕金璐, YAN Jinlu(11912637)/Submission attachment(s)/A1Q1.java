public class A1Q1 {
    public static void main(String[] args) {
        String name=args[0];
        int ID=Integer.parseInt(args[1]);

        if (11500000 < ID && ID < 12000000) {
            System.out.printf("%s, Welcome to SUSTech Hot Pot Restaurant!",name);
        } else {
            System.out.printf("%s,Wrong ID!Please check your ID number.",ID);
        }
    }
}



