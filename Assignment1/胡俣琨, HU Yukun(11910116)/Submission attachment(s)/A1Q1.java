public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int number =Integer.parseInt(args[1]);

        if (11500000<=number&& number<11999999)
            System.out.printf("%S, welcome to SUSTECH Hot Pot Restaurant!",name);
        else
            System.out.printf("%d",number);
    }
}
