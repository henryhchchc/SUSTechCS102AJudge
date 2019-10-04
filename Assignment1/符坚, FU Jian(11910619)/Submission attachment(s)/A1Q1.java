public class A1Q1 {
    public static void main(String[] args){
        String c=args[0];
        int id=Integer.parseInt(args[1]);
        if ((id>=11500000)&(id<=119000000)){
            System.out.println(c+", welcome to SUSTECH Hot Pot Restaurant!");
            return;
        }
        System.out.println(id);
    }
}
