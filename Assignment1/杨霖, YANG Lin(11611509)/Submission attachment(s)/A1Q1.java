public class A1Q1 {
    public static void main(String[] args){

        String name=args[0];
        int number=Integer.parseInt(args[1]);

        if (number<11500000)
            System.out.printf("%d",number);
        else if (number<12000000)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        else
            System.out.printf("%d",number);
    }
}
