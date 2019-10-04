public class A1Q1 {
    public static void main(String[] args){
        String username=(args[0]);
        int ID=Integer.parseInt(args[1]);

        if(ID>11500000&&ID<11999999) {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", username);
        }
        else
            System.out.printf("%d",ID);

    }
}
