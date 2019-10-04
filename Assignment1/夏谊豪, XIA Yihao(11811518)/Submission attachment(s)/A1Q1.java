import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int number1 = input.nextInt();
        if (number1 >= 12000000 || number1 < 11500000) {
            System.out.println(number1);
        } else {
            System.out.println(name + ", welcome to SUSTECH Hot Pot Restaurant!");
        }

    }
}