import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        String name;
        int id;
        Scanner input = new Scanner(System.in);
        name = input.next();
        id = input.nextInt();
        int  prefix = id / 100000;
        if(prefix >= 115 && prefix <= 119)
            System.out.println(name + ", welcome to SUSTECH Hot Pot Restaurant!");
        else
            System.out.println(id);
    }
}
