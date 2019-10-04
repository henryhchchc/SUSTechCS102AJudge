import java.util.Scanner;

public class A1Q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String number = in.next();
        int num = Integer.parseInt(number);

        if (number.length() != 8) {
            System.out.println(number);
        } else if (num < 11500000 && num >= 12000000) {
            System.out.println(number);
        } else {
            System.out.println(name + " , welcome to SUSTECH Hot Pot Restaurant! ");
        }

    }
}
