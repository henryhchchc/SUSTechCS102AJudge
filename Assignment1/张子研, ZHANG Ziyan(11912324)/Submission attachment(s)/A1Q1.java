public class A1Q1 {
    public static void main(String[] args) {
        String name = args[0];
        String num = args[1];
        int number = Integer.parseInt(num);

        if (number>=11500000 && number<12000000)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        else
            System.out.printf("%s",number);
    }
}