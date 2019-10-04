public class A1Q1 {
    public static void main(String[] args){
        String name=args[0];
        int id =Integer.parseInt(args[1]);

     if (id <11510000||id>11919999)
         System.out.printf("%d",id);
     else
         System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);

    }
}
