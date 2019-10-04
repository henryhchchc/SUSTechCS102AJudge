public class A1Q1 {
    public static void main(String[]args) {

        String name = args[0];
        int number = Integer.valueOf(args[1]);


        //String N =args[0];
        if (number < 11500000 || number > 12000000) {


            System.out.printf("%d",number);
        } else {
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
        }

    }}