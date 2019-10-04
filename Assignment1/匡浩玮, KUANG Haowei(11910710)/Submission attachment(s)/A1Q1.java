public class A1Q1 {
    public static void main(String[] args){
        String name=args[0];
        int a=Integer.parseInt(args[1]);
        if (11910000<=a){


            if (a<=11919999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }
        else
        if (11510000<=a){
            if (a<=11519999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }
        else System.out.print(a);
    }
}