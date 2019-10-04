

public class A1Q1 {
    public static void main(String[] args) {
        String name=args[0];
        int  id=Integer.parseInt(args[1]);
        if(id>=11500000&&id<12000000){
            System.out.printf("%s %d Welcome to SUSTECH Hot Pot Restaurant!",name,id);
        }else{
            System.out.printf("%d",id);
        }
    }
}
