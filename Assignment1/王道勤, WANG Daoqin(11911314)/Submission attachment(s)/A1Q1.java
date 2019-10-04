public class A1Q1 {

    public static void main(String[] args) {
        String name = args[0];
        int number = Integer.parseInt(args[1]);

        if (number > 11500000 && number < 12000000)
        {System.out.println(name  + ", welcome to SUSTECH Hot Pot Restaurant!");}
        else
        {System.out.println(number);}
    }
}
