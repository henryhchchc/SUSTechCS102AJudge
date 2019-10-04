import java.util.Scanner;

public class A1Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=Integer.parseInt(args[1]);
        String name=args[0];
        if (11500000 <= a & 11999999 >= a) {
            System.out.print(name);
            System.out.printf("\0%d,Welcome to SUSTECH HOT POT" ,a);

        }
        else{
            System.out.print("wrong ID");

        }
    }
}
