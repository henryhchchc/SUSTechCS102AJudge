public class A1Q1 {
    public static void main(String[] args) {
        String name=args[0];
        int ID=Integer.parseInt(args [1]);
        if(ID<=11999999&ID>=11500000){
        System.out.print(name+", welcome to SUSTECH Hot Pot Restaurant！");}
        else
            System.out.print(ID);
    }
}
