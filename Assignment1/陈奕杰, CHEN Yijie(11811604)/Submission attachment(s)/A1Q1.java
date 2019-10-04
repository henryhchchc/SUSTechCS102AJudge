import java.util.Scanner;

public class A1Q1 {

    public static void main(String[] args) {
        String name;
        int id;

        Scanner input = new Scanner(System.in);
        name = input.next();
        id = input.nextInt();

        if (id>=11500000 && id<=11999999)
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
        else
            System.out.printf("%d", id);
    }
}

