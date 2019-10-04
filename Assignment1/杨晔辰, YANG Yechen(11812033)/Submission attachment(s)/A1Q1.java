public class A1Q1 {
    public static void main(String[] args) {
        String id = args[0];
        int number = Integer.parseInt(args[1]);

        if(number >= 11500000 ) {
            if (number <= 11900000)
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restraurant!", id, number);
            else
                System.out.printf("%d",number);
        }
        else
            System.out.printf("%d",number);

    }
}
